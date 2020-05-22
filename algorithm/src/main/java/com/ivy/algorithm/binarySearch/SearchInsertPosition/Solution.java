package com.ivy.algorithm.binarySearch.SearchInsertPosition;

class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null||nums.length == 0) { //如果长度为0，则返回-1
            return -1;
        }
        int start = 0;
        int end = nums.length-1;
        if (target<=nums[0]){ //比最左边的都要少，插入最左边
            return 0;
        }
        if (target>nums[end]){ //比最右边都要大，播放右边
            return end+1;
        }

        while (start + 1 < end) {
            int middle = start + (end-start)/2;
            if (nums[middle] >= target) { //中间值》=目标值，在左半部分
                end = middle;
            } else if (nums[middle] < target) {
                start = middle;
            }
        }
        if (nums[start] <= target) {
            return start+1;
        }else{
            return end+1;
        }
    }
}
