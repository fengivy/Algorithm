package com.ivy.algorithm.array.DiagonalTraverse;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        int[][] a = new int[row][col];
        int value = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = value;
                value++;
            }
        }
        System.out.println("------------:"+ Arrays.toString(new Solution().findDiagonalOrder(a)));
    }
}
