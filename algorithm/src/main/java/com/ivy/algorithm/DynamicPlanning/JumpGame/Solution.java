package com.ivy.algorithm.DynamicPlanning.JumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        int n = nums.length;
        boolean[] f = new boolean[n+1];
        f[0] = true;
        f[1] = true;
        for (int i = 2; i <= n; i++) {
            f[i] = false;
            for (int j = i - 1; j > 0; j--) {
                if (f[j] && (j-1)+nums[j-1]>=(i-1)){
                    f[i] = true;
                    break;
                }
            }
        }
        return f[n];
    }
}
