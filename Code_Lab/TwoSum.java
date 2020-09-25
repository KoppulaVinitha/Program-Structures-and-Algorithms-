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
    public int[] twoSum(int[] nums, int target) {
        int count =0;
        int[] res = new int[2];
        for(int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int k = nums[i]+nums[j];
                
                if(k==target){
                    res[0] =i;
                    res[1] =j;
                    
                }
            }
        }
        return res;
        
    }
    
        
    
}
