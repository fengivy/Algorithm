package com.ivy.algorithm.binarySearch.FindMinimuminRotatedSortedArray;

public class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while (start + 1 < end) {
            int middle = start+(end-start)/2;
            if (nums[middle]>=nums[start]){
                if (nums[middle]>nums[end]){ //在左上升区间
                    start = middle;
                }else{
                    end = middle;
                }
            }else{
                end = middle;
            }
        }
        return Math.min(nums[start],nums[end]);
    }
}
