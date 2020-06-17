package com.ivy.algorithm.math.MissingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            while (nums[i]!=-1&& nums[i] != i) {
                if (nums[i] >= size) {
                    nums[i] = -1;
                }else{
                    int temp = nums[i];
                    nums[i]  = nums[nums[i]];
                    nums[temp] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] == -1) {
                return i;
            }
        }
        return size;
    }
}
