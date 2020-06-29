package com.ivy.algorithm.swordOffer.findNumberIn2DArray;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int i=row-1,j=0;
        while (i >= 0 && j <= col - 1) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                j++;
            }else{
                i--;
            }
        }
        return false;
    }
}
