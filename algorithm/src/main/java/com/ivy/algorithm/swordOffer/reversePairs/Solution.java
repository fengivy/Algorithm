package com.ivy.algorithm.swordOffer.reversePairs;

public class Solution {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            int begin =0;
            int end = i-1;
            result +=find(begin,end,i,nums);
        }
        return result;
    }

    private int find(int begin, int end,int k, int[] nums) {
        int originBegin = begin;
        int value = nums[k];
        while (begin + 1 < end) {
            int middle = begin+(end-begin)/2;
            if (nums[middle] <= value){
                end = middle;
            }else{
                begin = middle;
            }
        }

        if (nums[end] > value) {
            if (end + 1 == k) {
                return end+1-originBegin;
            }
            System.arraycopy(nums,end+1,nums,end+1+1,k-(end+1));
            nums[end+1] = value;
            return end-originBegin;
        } else if (nums[begin] > value) {
            System.arraycopy(nums,end,nums,end+1,k-end);
            nums[end] = value;
            return end-originBegin;
        }else{
            System.arraycopy(nums,begin,nums,begin+1,k-begin);
            nums[begin] = value;
            return begin-originBegin;
        }
    }
}
