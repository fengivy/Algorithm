package com.ivy.algorithm.swordOffer.movingCount;

public class Solution {
    public int movingCount(int m, int n, int k) {
        int[][] record = new int[m][n];
        return run(record,m,n,0,0,k);
    }

    private int run(int[][] record, int m, int n, int i, int j, int k) {
        if (i < 0 || i > m - 1 || j < 0 || j > n - 1) {
            return 0;
        }
        if (record[i][j] == 1) {
            return 0;
        }
        if (getNum(i) + getNum(j) > k) {
            return 0;
        }
        record[i][j] = 1;
        int top = run(record,m,n,i-1,j,k);
        int left = run(record, m, n, i, j - 1, k);
        int right = run(record, m, n, i, j + 1, k);
        int bottom = run(record, m, n, i + 1, j, k);
        return 1+top+left+right+bottom;
    }

    private int getNum(int num) {
        int value = 0;
        while (num > 0) {
            value+=(num%10);
            num /=10;
        }
        return value;
    }
}
