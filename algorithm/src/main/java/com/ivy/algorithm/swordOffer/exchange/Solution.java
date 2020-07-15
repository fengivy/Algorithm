package com.ivy.algorithm.swordOffer.exchange;

public class Solution {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int size = nums.length;
        int begin = 0,end = size-1;
        while (begin < end) {
            if (nums[begin] % 2 == 0) {
                int temp = nums[begin];
                nums[begin] = nums[end];
                nums[end] = temp;
                end--;
            }else{
                begin++;
            }
        }
        return nums;
    }
}
