package com.ivy.algorithm.sort.FindPeakElement;

public class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        return binarySearch(nums, start, end);
    }

    private int binarySearch(int[] nums, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = start+((end-start)/2);
        if (middle+1<nums.length&&nums[middle] < nums[middle + 1]) {
            return binarySearch(nums,middle+1,end);
        } else if (middle-1>=0&&nums[middle] < nums[middle - 1]) {
            return binarySearch(nums,start,middle-1);
        } else{
            return middle;
        }
    }
}
