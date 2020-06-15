package com.ivy.algorithm.backtracking.WordSearch;

public class SolutionTest {
    public static void main(String[] args) {
        char[][] a = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println("------------:" + new Solution().exist(a, "ABCCED"));
    }
}