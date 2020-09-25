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
    public ListNode partition(ListNode head, int x) {
     ListNode head1=new ListNode(0);
        ListNode t1=head1;
     ListNode head2=new ListNode(0);
        ListNode t2=head2;

        ListNode t=head;

        while(t!=null){

            if(t.val<x){

                t1.next=new ListNode(t.val);
                t1=t1.next;

            }
            else{

                t2.next=new ListNode(t.val);
                t2=t2.next;
                }
            t=t.next;
}
        t1.next=head2.next;
        
return head1.next;
}
}