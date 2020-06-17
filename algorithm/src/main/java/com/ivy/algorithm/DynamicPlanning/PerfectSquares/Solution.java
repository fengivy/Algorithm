package com.ivy.algorithm.DynamicPlanning.PerfectSquares;

public class Solution {
    public int numSquares(int n) {
        int[] f= new int[n+1];
        f[0] = 0;
        for (int i = 1; i <=n; i++) {
            f[i] = -1;
            int minSqrt = findMinSqrt(i);
            for (int j = minSqrt; j >= 1; j--) {
                int value = j*j;
                if (value > i) {
                    continue;
                }
                if (value == i) { //相等，那就最小值是1
                    f[i] = 1;
                    break;
                }
                if (f[i - value] >= 0) {
                    if (f[i] == -1) {
                        f[i] = f[i-value]+1;
                    }else{
                        f[i] = Math.min(f[i],f[i-value]+1);
                    }
                }
            }
        }
        return f[n];
    }

    private int findMinSqrt(int i) {
        int begin = 0;
        int end = i;
        while (begin + 1 < end) {
            int middle = begin+(end-begin)/2;
            if (middle * middle == i) {
                return middle;
            }else if (middle * middle > i) {
                end = middle;
            }else {
                begin = middle;
            }
        }
        return end;
    }
}
