package com.ivy.algorithm.array.RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[size - 1];
                nums[size-1] = temp;
                size--;
                i--;
            }
        }
        return size;
    }
}
