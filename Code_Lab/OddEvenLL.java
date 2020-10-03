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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return head;
        ListNode lastEven = head.next;
        ListNode firstEven = head.next;
        ListNode currOdd = head;
        ListNode nextOdd = head.next.next;
        while(nextOdd != null) {
            
            ListNode next = nextOdd.next;
            ListNode prev = next;
            currOdd.next = nextOdd;
            nextOdd.next = firstEven;
            lastEven.next = next;
            
            currOdd = currOdd.next;
            if(next != null) {
                nextOdd = next.next;
            } else {
                nextOdd = next;
            }
            lastEven = lastEven.next;
        }
        
        return head;
    }
}