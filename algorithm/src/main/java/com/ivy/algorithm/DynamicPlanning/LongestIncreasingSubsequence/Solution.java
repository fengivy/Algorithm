package com.ivy.algorithm.DynamicPlanning.LongestIncreasingSubsequence;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int maxResult = 0;
        int size = nums.length;
        int[] f = new int[size+1];
        f[0]  = 0;
        for (int i = 1; i <= size; i++) {
            f[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                if (nums[i-1]>nums[j-1]){
                    f[i] = Math.max(f[i],f[j]+1);
                }
            }
            maxResult = Math.max(f[i],maxResult);
        }
        return maxResult;
    }
}
