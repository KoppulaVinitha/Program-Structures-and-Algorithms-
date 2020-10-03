/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] ans = new ListNode[k];
        
        ListNode ptr = root;
        int l = 0;
        while( ptr != null ) {
            l++;
            ptr = ptr.next;
        }
        
        ptr = root;
        ListNode tmp = ptr;
        if( l<=k ){
            int i = 0;
            while( ptr != null ){
                tmp = ptr.next;
                ans[i] = ptr;
                ptr.next = null;
                ptr = tmp;
                i++;
            }
        }
        
        else {
            int i = k-1;
            int[] parts = new int[k];
            while( k!=0 ){
                int part = l/k;
                l -= part;
                parts[i] = part;
                k--;
                i--;
            }
    
            i = 0;
            for (int part:parts){
                ans[i] = ptr;
                while( part-1 != 0){
                    ptr = ptr.next;
                    part --;
                }
                tmp = ptr.next;
                ptr.next = null;
                ptr = tmp;
                i++;
            }
        }
        
        return ans;
    }
}