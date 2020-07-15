package com.ivy.algorithm.swordOffer.majorityElement;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if (nums.length==1){
            return nums[0];
        }
        int num = 1;
        int lastNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]== lastNum){
                num++;
                if (num>nums.length/2){
                    return nums[i];
                }
            }else{
                num = 1;
                lastNum = nums[i];
            }
        }
        return -1;
    }
}
