package com.ivy.algorithm.DynamicPlanning.TheMasseuseLCCI;

public class Solution {
    public int massage(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }

        for (int i = 2; i < nums.length; i++) {
            int maxLast = Integer.MIN_VALUE;
            for (int j = 0; j <= i - 2; j++) {
                maxLast = Math.max(nums[j]+nums[i],maxLast);
            }
            nums[i] = Math.max(nums[i-1],maxLast);
        }
        return nums[nums.length-1];
    }
}
