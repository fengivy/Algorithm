package com.ivy.algorithm.DynamicPlanning.MaximalSquare;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxResult = 0;
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] f = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                f[i][j] =0; //初始化为0
                if (matrix[i][j] == '0'){
                    continue;
                }
                f[i][j] =1;
                if (i != 0 && j != 0 ) { //非上边和左边数据处理
                    if (f[i-1][j-1]!=0 &&f[i-1][j]!=0&&f[i][j-1]!=0){ ////构成正方形
                        f[i][j] = Math.min(f[i-1][j-1],Math.min(f[i-1][j],f[i][j-1]))+1;
                    }
                }
                maxResult = Math.max(maxResult,f[i][j]);
            }
        }
        return maxResult*maxResult;
    }
}
