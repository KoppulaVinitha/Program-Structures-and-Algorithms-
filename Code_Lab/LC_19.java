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
    public ListNode removeNthFromEnd(ListNode head, int n) {
          ListNode dummy_head = new ListNode(0);
          dummy_head.next = head;
        
        ListNode first = dummy_head;
        ListNode second = dummy_head;
        
        for(int i=1; i<=n+1; i++){
            first = first.next;
        }
        while(first!=null){
            second = second.next;
            first = first.next;
        }
        second.next = second.next.next;
        return dummy_head.next;
    }
}