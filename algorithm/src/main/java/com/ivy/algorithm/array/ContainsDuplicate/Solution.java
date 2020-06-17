package com.ivy.algorithm.array.ContainsDuplicate;

import java.util.Arrays;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
