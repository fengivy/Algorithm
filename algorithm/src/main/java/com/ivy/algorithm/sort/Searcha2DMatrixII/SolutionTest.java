package com.ivy.algorithm.sort.Searcha2DMatrixII;

public class SolutionTest {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        System.out.println("-----------------:"+new Solution().searchMatrix(a,5));
        System.out.println("-----------------:"+new Solution().searchMatrix(a,20));
    }
}
