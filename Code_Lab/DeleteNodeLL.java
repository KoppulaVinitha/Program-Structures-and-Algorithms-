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
    public void deleteNode(ListNode node) {
        while(node.next.next!=null)
        {
            node.val=node.next.val;
            node=node.next;
        }
        node.val=node.next.val;
        node.next=null;
    }