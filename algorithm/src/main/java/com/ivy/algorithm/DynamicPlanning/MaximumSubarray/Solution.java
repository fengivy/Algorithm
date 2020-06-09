package com.ivy.algorithm.DynamicPlanning.MaximumSubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxValue = Integer.MIN_VALUE;
        int n = nums.length;
        int lastAddValue = 0;
        for (int i = 0; i < n; i++) {
            lastAddValue+=nums[i];
            maxValue = Math.max(lastAddValue,maxValue);
            if (lastAddValue <= 0) {
                lastAddValue = 0;
            }
        }
        return maxValue;
    }
}
