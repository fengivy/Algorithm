package com.ivy.algorithm.array.MinimumSizeSubarraySum;

public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int currentValue = 0;
        int minNum = Integer.MAX_VALUE;
        int currentNum =0;
        for (int i = 0; i < nums.length; i++) {
            currentValue+=nums[i];
            if (currentValue < s) {
                currentNum++;
            }else{
                currentNum++;
                minNum =Math.min(minNum,currentNum);
                for(int j=i-(currentNum-1);j<i;j++){
                    if (currentValue - nums[j] >= s) {
                        currentNum--;
                        currentValue -=nums[j];
                        minNum = Math.min(currentNum,minNum);
                    }else{
                        break;
                    }
                }
            }
        }
        return minNum==Integer.MAX_VALUE?0:minNum;
    }
}
