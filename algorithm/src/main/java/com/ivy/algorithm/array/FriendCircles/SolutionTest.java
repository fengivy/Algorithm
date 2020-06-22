package com.ivy.algorithm.array.FriendCircles;

public class SolutionTest {
    public static void main(String[] args) {
        int[][] a = new int[][]{
        {1,0,0,1},
        {0,1,1,0},
        {0,1,1,1},
        {1,0,1,1}};
        System.out.println("----------:"+new Solution().findCircleNum(a));
    }
}
