package com.ivy.algorithm.binarySearch.MagicIndex;

public class Solution {
    public int findMagicIndex(int[] nums) {
        if (nums == null || nums.length == 0) { // 题目不是长度的数组，没法实现logN,只能用二分递归两实现n
            return -1;
        }
        if (nums.length == 1) {
            if (nums[0] == 0) {
                return 0;
            }else{
                return -1;
            }
        }
        int start = 0;
        int end = nums.length-1;
        /*while (start + 1 < end) {
            int middle = start+(end-start)/2;
            if (nums[middle] >= middle) {
                start = middle;
            }else{
                end = middle;
            }
        }
        if (nums[start] == start) {
            return start;
        }
        if (nums[end] == end) {
            return end;
        }
        return -1;*/
        int result = find(nums,start,end);
        return result;
    }

    private int find(int[] nums,int start, int end) {
        if (start + 1 >= end) {
            if (nums[start] == start) {
                return start;
            } else if(nums[end] == end){
                return end;
            }else{
                return -1;
            }
        }
        int middle = start +(end-start)/2;
        int result = -1;
        if (nums[middle] == middle){
            result = middle;
        }
        int leftValue = find(nums,start,middle);
        if (leftValue != -1) {
            return leftValue;
        } else if (result!=-1){
            return result;
        }else{
            return find(nums, middle, end);
        }
    }
}
