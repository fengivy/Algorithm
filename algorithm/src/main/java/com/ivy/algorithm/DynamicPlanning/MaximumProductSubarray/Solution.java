package com.ivy.algorithm.DynamicPlanning.MaximumProductSubarray;

public class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null||nums.length ==0) {
            return 0;
        }
        int size = nums.length;
        //0是小最值，1是小大值
        int[][] f = new int[size][2];
        int result  = f[0][0] = f[0][1] = nums[0];
        for (int i = 1; i < size; i++) {
            f[i][0] = Math.min(Math.min(nums[i],nums[i]*f[i-1][0]),nums[i]*f[i-1][1]);
            f[i][1] = Math.max(Math.max(nums[i],nums[i]*f[i-1][0]),nums[i]*f[i-1][1]);
            result = Math.max(result,f[i][1]);
        }
        return result;
    }
}
