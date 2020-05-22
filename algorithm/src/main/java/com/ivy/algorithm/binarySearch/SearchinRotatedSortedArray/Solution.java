package com.ivy.algorithm.binarySearch.SearchinRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length -1;
        while (start + 1 < end) {
            int middle = start+(end-start)/2;
            if (nums[middle] == target) {
                return middle;
            }
            //切在左半区间
            if (nums[middle]>=nums[start]){
                if (nums[middle] > target && nums[start] <= target) {
                    end = middle;
                }else{
                    start = middle;
                }
            }else{
                if (nums[middle] < target && nums[end] >= target) {
                    start = middle;
                }else{
                    end = middle;
                }
            }
        }
        if (nums[start] == target) {
            return start;
        } else if (nums[end] == target) {
            return end;
        }else{
            return -1;
        }
    }
}
