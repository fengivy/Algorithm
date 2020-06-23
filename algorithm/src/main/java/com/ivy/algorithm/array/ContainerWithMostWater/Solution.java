package com.ivy.algorithm.array.ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int maxResult = 0;
        int size = height.length;
        for (int i = 1; i < size; i++) {
            for (int j = i - 1; j >= 0; j--) {
                maxResult = Math.max(maxResult,Math.min(height[i],height[j])*(i-j));
            }
        }
        return maxResult;
    }
}
