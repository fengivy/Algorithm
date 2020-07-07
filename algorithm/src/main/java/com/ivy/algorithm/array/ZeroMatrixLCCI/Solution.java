package com.ivy.algorithm.array.ZeroMatrixLCCI;

public class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] record = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                record[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (record[i][j] == 0) {
                    for (int k = 0; k < row; k++) {
                        matrix[k][j] = 0;
                    }
                    for (int k = 0; k < col; k++) {
                        matrix[i][k] =0;
                    }
                }
            }
        }
    }
}
