package com.ivy.algorithm.array.MaxConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        }
        int size = nums.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 1) {
                count++;
                if (i == size - 1) {
                    result = Math.max(count,result);
                }
            }else if(nums[i] == 0){
                result = Math.max(count,result);
                count = 0;
            }
        }
        return result;
    }
}
