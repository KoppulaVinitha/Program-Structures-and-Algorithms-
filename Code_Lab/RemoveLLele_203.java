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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next;
            if(curr.val == val){
                if(head == curr){
                    head = next;
                }
            } else {
                prev = curr;
            }
            
            if(prev != null){
                prev.next = next;
            }
            curr = next;
        }
        
        return head;
    }
}