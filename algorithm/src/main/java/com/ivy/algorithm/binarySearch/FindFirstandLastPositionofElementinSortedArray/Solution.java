package com.ivy.algorithm.binarySearch.FindFirstandLastPositionofElementinSortedArray;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1,-1};
        }
        int start = 0;
        int end = nums.length-1;
        return findRange(start,end,nums,target);
    }

    private int[] findRange(int start, int end, int[] nums, int target) {
        if (start +1>= end) {
            if (nums[start] == target && nums[end] == target) {
                return new int[]{start,end};
            } else if (nums[start] == target) {
                return new int[]{start,start};
            } else if(nums[end] == target){
                return new int[]{end,end};
            }else{
                return new int[]{-1,-1};
            }
        }
        int middle = start+(end-start)/2;
        if (nums[middle] == target) {
            int left = findIndex(start,middle,nums,target,true);
            int right = findIndex(middle,end,nums,target,false);
            return new int[]{left,right};
        } else if (nums[middle] < target) {
            return findRange(middle,end,nums,target);
        }else{
            return findRange(start,middle,nums,target);
        }
    }

    private int findIndex(int start, int end, int[] nums, int target,boolean isLeft) {
        if (start+1>=end){
            if (isLeft){
                return nums[start] == target?start:end;
            }else{
                return nums[end]==target?end:start;
            }
        }
        int middle = start+(end-start)/2;
        if (isLeft){
            if (nums[middle]==target){
                return findIndex(start,middle,nums,target, true);
            }else{
                return findIndex(middle,end,nums,target, true);
            }
        }else{
            if (nums[middle]==target){
                return findIndex(middle,end,nums,target, false);
            }else{
                return findIndex(start,middle,nums,target, false);
            }
        }
    }
}
