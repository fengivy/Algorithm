package com.ivy.algorithm.array.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null||matrix.length==0) {
            return result;
        }
        int row = matrix.length-1;
        int col = matrix[0].length-1;
        int minRow=0,minCol = 0;
        while (minRow <= row && minCol <= col) {
            //上
            for (int i = minCol; i <= col; i++) {
                result.add(matrix[minRow][i]);
            }
            minRow++;
            if(minRow > row || minCol > col){
                break;
            }
            //右
            for (int i = minRow; i <= row; i++) {
                result.add(matrix[i][col]);
            }
            col--;
            if(minRow > row || minCol > col){
                break;
            }
            //下
            for (int i = col; i >= minCol; i--) {
                result.add(matrix[row][i]);
            }
            row--;
            if(minRow > row || minCol > col){
                break;
            }
            //左
            for (int i = row; i >= minRow; i--) {
                result.add(matrix[i][minCol]);
            }
            minCol++;
        }
        return result;
    }
}
