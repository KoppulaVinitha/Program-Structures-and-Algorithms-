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
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = nums2.length - 1; i >= 0; i--){
           while (!s.isEmpty() && s.peek() < nums2[i])
               s.pop();
            map.put(nums2[i], -1);
           if (!s.isEmpty())
                map.put(nums2[i], s.peek());   
            s.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++)
            nums1[i] = map.get(nums1[i]);
        return nums1;
    }
}