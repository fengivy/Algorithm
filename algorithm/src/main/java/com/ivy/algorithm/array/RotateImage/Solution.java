package com.ivy.algorithm.array.RotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        int begin = 0;
        int end = matrix.length-1;
        int size = matrix.length-1;
        while (begin<end) {
            for (int i = begin; i < end; i++) {
                int temp = matrix[begin][i];
                matrix[begin][i] = matrix[size-i][begin];
                matrix[size-i][begin] = matrix[end][size-i];
                matrix[end][size-i] = matrix[i][end];
                matrix[i][end] = temp;
            }
            begin++;
            end--;
        }
    }
}
