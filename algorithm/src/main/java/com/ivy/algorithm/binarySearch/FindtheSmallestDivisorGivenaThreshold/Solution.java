package com.ivy.algorithm.binarySearch.FindtheSmallestDivisorGivenaThreshold;

public class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 0;
        int end = -1;
        for (int num : nums) {
            end = Math.max(end, num);
            start = Math.max(0,(int)Math.ceil(((double) num)/threshold));
        }

        while (start + 1 < end) {
            int middle = start+(end-start)/2;
            if (getThresholdValue(middle,nums,threshold)<=threshold){
                end = middle;
            }else{
                start = middle;
            }
        }
        int startThreshold = getThresholdValue(start,nums,threshold);
        int endThreshold = getThresholdValue(end,nums,threshold);
        if (startThreshold <= threshold && endThreshold <= threshold) {
            return start;
        }else{
            if (startThreshold <= threshold) {
                return start;
            }else{
                return end;
            }
        }
    }

    private int getThresholdValue(int divide, int[] nums,int threshold) {
        int total= 0;
        for (int num : nums) {
            total += Math.ceil(((double) num) / divide);
            if (total > threshold) {
                return total;
            }
        }
        return total;
    }
}
