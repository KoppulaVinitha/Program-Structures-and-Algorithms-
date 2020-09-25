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
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int j = 0;
        for(int i =0; i<k;i++){
            
                int last = nums[l-1];

        for(j=l-1;j>0;j--){
            nums[j] = nums[j-1];
        }
        nums[0] = last;
        
    }
    }
    
}