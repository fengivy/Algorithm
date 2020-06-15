package com.ivy.algorithm.array.SetMatrixZeroes;

public class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int maxValue = Integer.MIN_VALUE;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] mark = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    mark[i][j] = 0;
                }else{
                    mark[i][j] =1;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                check(matrix,i,j,mark);
            }
        }
    }

    private void check(int[][] matrix, int row, int col,int[][] mark) {
        if (mark[row][col]!=0) {
            return;
        }
        mark[row][col] =1;
        for (int i = 0; i < matrix.length; i++) {
            check(matrix,i,col,mark);
            matrix[i][col] = 0;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            check(matrix,row,i,mark);
            matrix[row][i] = 0;
        }
    }
}
