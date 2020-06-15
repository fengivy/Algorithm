package com.ivy.algorithm.array.IncreasingTripletSubsequence;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int size  = nums.length;
        int[] f = new int[size+1];
        f[0] =0;
        f[1] =1;
        for (int i = 2; i <= size; i++) {
            f[i] = 1;
            for (int j = i - 1; j >= 1; j--) {
                if (nums[i - 1] > nums[j - 1]) {
                    f[i] = Math.max(f[i],f[j]+1);
                }
            }
            if (f[i] >= 3) {
                return true;
            }
        }
        return false;
    }
}
