package com.ivy.algorithm.array.SlidingWindowMaximum;

public class Solution {
    //todo nk不行，要用n ,可用单调递减栈，时间复杂度为2n
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null) {
            return null;
        }

        int size = nums.length;
        int[] result = new int[size-k+1];
        for (int i = k-1; i < size; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = i; j >= i - k + 1; j--) {
                maxValue = Math.max(nums[j],maxValue);
            }
            result[i-(k-1)] = maxValue;
        }
        return result;
    }
}
