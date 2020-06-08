package com.ivy.algorithm.array.RotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if (nums == null || nums.length == 0 ||nums.length==1 ||k==0) {
            return;
        }
        int size = nums.length-1;
        k = k-1;
        rotateNum(nums,0,size,size/2);
        rotateNum(nums,0,k,(k)/2);
        rotateNum(nums,k+1,size,(size-(k+1))/2);
    }

    private void rotateNum(int[] nums, int start, int end, int k) {
        int temp;
        int i=0;
        while (i <= k) {
            temp = nums[start+i];
            nums[start+i] = nums[end-i];
            nums[end-i] = temp;
            i++;
        }
    }
}
