package com.ivy.algorithm.array.DiagonalTraverse;

import java.util.Stack;

public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[]{};
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int[] result = new int[row * col];
        int count = 0;
        boolean needReverse = true;
        for (int i = 0; i < col; i++) {
            count = fill(matrix, row, result, count, needReverse, 0,i);
            needReverse=!needReverse;
        }
        for (int i = 1; i < row; i++) {
            count = fill(matrix,row,result,count,needReverse,i,col-1);
            needReverse=!needReverse;
        }
        return result;
    }

    private int fill(int[][] matrix, int row, int[] result, int count, boolean needReverse, int tempRow,int tempCol) {
        if (needReverse) {
            Stack<Integer> stack = new Stack<>();
            while (tempRow < row && tempCol >= 0) {
                stack.add(matrix[tempRow][tempCol]);
                tempCol--;
                tempRow++;
            }
            while (!stack.isEmpty()) {
                result[count] = stack.pop();
                count++;
            }
        }else{
            while (tempRow < row && tempCol >= 0) {
                result[count] = matrix[tempRow][tempCol];
                tempCol--;
                tempRow++;
                count++;
            }
        }
        return count;
    }
}
