package com.ivy.algorithm.sort.KthLargestElementinanArray;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (k <= 0 || k > nums.length) {
            return -1;
        }
        return findK(nums,0,nums.length-1,(nums.length-k+1)-1);
    }

    private int findK(int[] nums, int start, int end, int k) {
        if (start >= end) {
            if (start == end &&start == k) {
                return nums[k];
            }
            return -1;
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
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
            }
        }
        if (j+1 ==i-1 && j+1==k){
            return nums[k];
        } else if (j < k) {
            return findK(nums,i,end,k);
        }else{
            return findK(nums,start,j,k);
        }
    }
}
