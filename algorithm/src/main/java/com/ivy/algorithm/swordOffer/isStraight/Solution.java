package com.ivy.algorithm.swordOffer.isStraight;

import java.util.Arrays;

public class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int useNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                useNum++;
            }else{
                if (i == 0||nums[i-1]==0) {
                    continue;
                }else{
                    if (nums[i] == nums[i - 1]) {
                        return false;
                    }
                    int divideNum = nums[i]-nums[i-1]-1;
                    if (useNum - divideNum < 0) {
                        return false;
                    }else{
                        useNum = useNum-divideNum;
                    }
                }
            }
        }
        return true;
    }
}
