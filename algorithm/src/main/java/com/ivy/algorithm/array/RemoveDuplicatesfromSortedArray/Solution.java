package com.ivy.algorithm.array.RemoveDuplicatesfromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int size = nums.length;
        int num = nums.length;
        int lastNum = nums[size-1];
        int sameNum = 0;
        for (int i = size - 2; i >= 0; i--) {
            if (nums[i] == lastNum) {
                sameNum ++;
                if (i == 0) {
                    moveArray(i,nums,sameNum,num-1);
                    num -=sameNum;
                    sameNum = 0;
                }
            }else{
                if (sameNum > 0) {
                    moveArray(i+1,nums,sameNum,num-1);
                    num -=sameNum;
                    sameNum = 0;
                }
                lastNum = nums[i];
            }
        }
        return num;
    }

    private void moveArray(int position,int[] nums, int sameNum, int lastPosition) {
        System.arraycopy(nums, position + sameNum, nums, position, lastPosition-(position+sameNum)+1);
    }
}
