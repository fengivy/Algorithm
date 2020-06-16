package com.ivy.algorithm.array.ProductofArrayExceptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null) {
            return null;
        }
        if (nums.length == 0) {
            return nums;
        }
        int size = nums.length;
        int[] result = new int[size];
        for (int i = nums.length-1; i >=0; i--) {
            if (i == nums.length - 1) {
                result[i] = nums[i];
            }else{
                result[i] = nums[i] * result[i+1];
            }
        }
        for (int i = 1; i < nums.length - 1; i++) {
            nums[i] = nums[i] * nums[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = result[i+1];
            } else if (i == nums.length - 1) {
                result[i] = nums[i-1];
            }else{
                result[i] = result[i+1]*nums[i-1];
            }
        }
        return result;
    }
}
