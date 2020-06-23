package com.ivy.algorithm.string.SpiralMatrixII;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int startX = 0,endX = n-1;
        int startY =0,endY = n-1;
        int value = 1;
        while (startX <= endX && startY <= endY) {
            if (startX <= endX && startY <= endY){
                for (int i = startY; i <= endY; i++) {
                    nums[startX][i] = value++;
                }
                startX++;
            }

            if (startX <= endX && startY <= endY){
                for (int i = startX; i <= endX; i++) {
                    nums[i][endY] = value++;
                }
                endY--;
            }

            if (startX <= endX && startY <= endY) {
                for (int i = endY; i >= startY; i--) {
                    nums[endX][i] = value++;
                }
                endX--;
            }

            if (startX <= endX && startY <= endY){
                for (int i = endX; i >= startX; i--) {
                    nums[i][startY] = value++;
                }
                startY++;
            }
        }
        return nums;
    }
}
