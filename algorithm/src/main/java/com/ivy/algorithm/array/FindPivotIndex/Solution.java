package com.ivy.algorithm.array.FindPivotIndex;

public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum+=nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                leftSum+=nums[i-1];
            }
            rightSum-=nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
    //正数优化方法
    /*public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        int leftSum = nums[left],rightSum = nums[right];
        while (left < right) {
            if (leftSum == rightSum && left + 1 == right-1) {
                return left+1;
            } else if (leftSum >= rightSum) {
                right--;
                rightSum +=nums[right];
            } else {
                left++;
                leftSum +=nums[left];
            }
        }
        return -1;
    }*/
}
