package com.ivy.algorithm.array.MaxAreaofIsland;


public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxResult = 0;
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) { //使用深搜来处理,处理过的标记为0
                if (grid[i][j]!=0){
                    int size = search(grid,i,j);
                    maxResult = Math.max(size,maxResult);
                }
            }
        }
        return maxResult;
    }

    private int search(int[][] grid, int i, int j) {
        if (i<0|| j<0 || i>grid.length-1|| j>grid[0].length-1|| grid[i][j] == 0 ) {
            return 0;
        }
        grid[i][j] =0;
        int left = search(grid,i-1,j);
        int top = search(grid,i,j-1);
        int right = search(grid,i+1,j);
        int bottom = search(grid,i,j+1);
        return 1+right+bottom+left+top;
    }
}
