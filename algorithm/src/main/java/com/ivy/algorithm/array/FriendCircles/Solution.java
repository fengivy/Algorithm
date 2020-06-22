package com.ivy.algorithm.array.FriendCircles;

public class Solution {
    public int findCircleNum(int[][] M) {
        if (M == null || M.length == 0) {
            return 0;
        }
        int result = 0;
        int row = M.length;
        int col = M[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] == 1){
                    result++;
                    findAllRelation(M,i,j);
                }
            }
        }
        return result;
    }

    private void findAllRelation(int[][] m, int i, int j) {
        if (m[i][j] == 0) {
            return;
        }
        m[i][j] = 0;
        for(int k =0;k<m[0].length;k++){
            if (m[i][k] == 1){
                m[i][k] = 0;
                findAllRelation(m,k,i);
            }
        }
    }
}
