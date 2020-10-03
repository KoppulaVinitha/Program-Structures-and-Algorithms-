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

public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }
        
        return reverse(head, k);
    }
    
    ListNode reverse(ListNode head, int k) {
        int counter = 0;
        ListNode prev = null;
        ListNode nextHead = head;
        ListNode tail = head;
        
        while (counter < k && head != null) {
            nextHead = nextHead.next;
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            counter++;
        }

        if (hasKNodes(nextHead, k)) {
            tail.next = reverse(nextHead, k);
        } else {
            tail.next = nextHead;
        }
        
        return prev;
    }
    
    boolean hasKNodes(ListNode head, int k) {
        int counter = 0;
        while (head != null && counter < k) {
            counter++;
            head = head.next;
        }
        
        return counter == k;
    }
}
}
