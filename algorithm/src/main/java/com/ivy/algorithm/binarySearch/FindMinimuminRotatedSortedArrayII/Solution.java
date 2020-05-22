package com.ivy.algorithm.binarySearch.FindMinimuminRotatedSortedArrayII;

public class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while (start + 1 < end) {
            int middle =start +(end-start)/2;
            if (nums[middle] > nums[end]) {
                start = middle;
            } else if (nums[middle] < nums[end]) {
                end = middle;
            }else{
                end--;
            }
        }
        return Math.min(nums[start],nums[end]);
    }
}
