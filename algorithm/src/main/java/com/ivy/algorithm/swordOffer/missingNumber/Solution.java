package com.ivy.algorithm.swordOffer.missingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        if (nums == null ||nums.length == 0) {
            return 0;
        }
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (i==0&&nums[i] != 0) {
                return 0;
            }else{
                if (i != nums[i]) {
                    return i;
                }
            }
        }
        return size;
    }
}
