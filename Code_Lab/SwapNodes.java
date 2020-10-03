/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
class solution{
    
     public ListNode swapPairs(ListNode head) {
        if (head == null)
            return head;
        
        ListNode iterator = head; 
        ListNode previous = head;
        while (iterator != null && iterator.next != null) {
            ListNode temp = iterator.next;
            iterator.next = temp.next;
            temp.next = iterator;
            if (previous != head) { // Makes sure to recconect the list to the newly swapped pair
                previous.next = temp;            
            }
            if (iterator == head) { // Makes sure to set head to point to new first node
                head = temp;
            }
            previous = iterator;
            iterator = iterator.next;
        }
        
        return head;
    }
}
