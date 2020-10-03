/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
class Solution{
    

 public static ListNode deleteDuplicates(ListNode head) {
    if(head == null){
      return head;
    }
    ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
    ListNode prev = dummyHead;
    ListNode curr = head;
    boolean isDuplicate = false;
    while (curr != null && curr.next != null) {
      if (curr.val == curr.next.val) {
        curr.next = curr.next.next;
        isDuplicate = true;
      } else {
        ListNode next = curr.next;
        if (!isDuplicate) {
          curr.next = null;
          prev.next = curr;
          prev = curr;
        }
        isDuplicate = false;
        curr = next;
      }
    }
    if (!isDuplicate && prev.val != curr.val) {
      prev.next = curr;
    }
    return dummyHead.next;
  }
}
