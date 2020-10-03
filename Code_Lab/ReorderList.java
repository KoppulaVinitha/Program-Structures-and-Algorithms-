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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode midNode=mid(head);
        midNode=reverse(midNode);
        reorder(head,midNode);
    }
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode forw=head;
        while(curr!=null){
            forw=forw.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
    public void reorder(ListNode head1,ListNode head2){
        ListNode forw=null;
        while(head2.next!=null){
            forw=head1.next;
            head1.next=head2;
            head1=head2;
            head2=forw;
        }
    }
}