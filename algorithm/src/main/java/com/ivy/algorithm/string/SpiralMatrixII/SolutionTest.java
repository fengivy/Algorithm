package com.ivy.algorithm.string.SpiralMatrixII;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[][] a = new Solution().generateMatrix(6);
        for (int i = 0; i < a.length; i++) {
            System.out.println("-------------:"+ Arrays.toString(a[i]));
        }

    }
}
