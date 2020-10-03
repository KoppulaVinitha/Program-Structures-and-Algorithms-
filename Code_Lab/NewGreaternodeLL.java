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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        int ans[]=new int[n];
        if(n==0)
            return ans;
        Arrays.fill(ans,0);
        int i=0;
        while(head!=null)
        {
            temp=head.next;
            while(temp!=null)
            {
                if(temp.val>head.val)
                {
                    ans[i]=temp.val;
                    break;
                }
                temp=temp.next;
            }
            i++;
            head=head.next;
        }
        return ans;
    }
}