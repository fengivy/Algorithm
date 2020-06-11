package com.ivy.algorithm.array.TwoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        if (nums == null||nums.length ==0) {
            return result;
        }
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
