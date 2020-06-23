package com.ivy.algorithm.array.ThreeSumClosest;

import java.util.Arrays;

public class Solution {
    //暴力为N的3次方，优化后为N方+nLogn
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        double result = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while (j < k) {
                int value = nums[i] + nums[j] + nums[k];
                if (value== target) {
                    return value;
                } else if (value < target) {
                    j++;
                }else{
                    k--;
                }
                if (Math.abs(value - target) < Math.abs(result - target)) {
                    result = value;
                }
            }
        }
        return (int) result;
    }
}
