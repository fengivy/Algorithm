package com.ivy.algorithm.array.NumberofIslands;

public class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        if (grid == null || grid.length == 0) {
            return result;
        }
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1'){ //找到岛屿，深搜，重置为0
                    result++;
                    depthSearch(grid,i,j);
                }
            }
        }
        return result;
    }

    private void depthSearch(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1) { //边界
            return;
        }
        if (grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        depthSearch(grid,i-1,j);
        depthSearch(grid,i+1,j);
        depthSearch(grid,i,j-1);
        depthSearch(grid,i,j+1);
    }
}
