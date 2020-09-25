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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dup = head;
                 if(dup==null){
                     return head;
                 }

        
        while(dup!=null&&dup.next!=null){
            if(dup.val==dup.next.val){
                dup.next = dup.next.next;
            }
            else{
                dup = dup.next;
            }
        }
        return head;
    }
}