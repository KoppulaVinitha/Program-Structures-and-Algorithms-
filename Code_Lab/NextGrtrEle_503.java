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
    public int[] nextGreaterElements(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        int []res = new int[n];
        for(int i = 0; i < n; i++){
            int j = 1;
            for(; j < n; j++){
                if(nums[(i+j)%n]>nums[i]){
                    nums[i] = nums[(i+j)%n];
                    break;
                }
            }
            if(j == n)nums[i] = -1;
        }
        return nums;
    }
}