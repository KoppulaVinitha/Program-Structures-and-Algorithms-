/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author koppu
 */
class solution{
    public boolean find132pattern(int[] nums) {
    
    if(nums.length<3)
        return false; 
    
    int minsToLeft[] = new int[nums.length];
    
    int min = nums[0]; 
    minsToLeft[0] = Integer.MAX_VALUE;
    for(int i=1; i<nums.length; i++) {
       min = Math.min(min, nums[i-1]);  
       minsToLeft[i] = min;
    }
    
    min =  Integer.MAX_VALUE; 
    for(int i=nums.length-2; i>=0; i--) { 
        int minCantidate = Math.min(min, nums[i+1]);
        if(minCantidate>minsToLeft[i])
            min = minCantidate;
        if(nums[i] > minsToLeft[i] && nums[i]>min && min>minsToLeft[i]) 
            return true;
    }
    
    return false;
}
}
