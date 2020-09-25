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
    public int getDecimalValue(ListNode head) {
        
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        
       int decimal=0;

        
        for(int i=count-1;i>=0;i--)
        {
            decimal=decimal+head.val*(int)Math.pow(2,i);
            head=head.next;
        }
        
        return decimal;
        
    }
}