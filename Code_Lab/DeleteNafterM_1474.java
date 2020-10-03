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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode runner = head;
        int counter = 1;
        
        while(runner != null) {
            
            if(counter % m == 0) {
                ListNode remove = runner;
                int removed = 0;
                
                while(removed <= n && remove != null) {
                    remove = remove.next;
                    removed++;
                }
                
                counter = 0;
                runner.next = remove;
            }
            
            runner = runner.next;
            counter++;
        }
        
        return head;
    }
}