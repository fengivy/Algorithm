package com.ivy.algorithm.sort.SortColors;

public class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int start = 0;
        int end = nums.length-1;
        quickSort(nums,start,end);
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int value = nums[start+(end-start)/2];
        while (i <= j) {
            while (i <= j && nums[i] < value) {
                i++;
            }
            while (i <= j && nums[j] > value) {
                j--;
            }
            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(nums, start, j);
        quickSort(nums,i,end);
    }
}
