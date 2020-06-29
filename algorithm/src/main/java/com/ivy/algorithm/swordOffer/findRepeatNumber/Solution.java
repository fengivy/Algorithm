package com.ivy.algorithm.swordOffer.findRepeatNumber;

import java.util.Arrays;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length <=1) {
            return -1;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
}
