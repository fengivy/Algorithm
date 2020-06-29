package com.ivy.algorithm.swordOffer.numWays;

public class Solution {
    public int numWays(int n) {
        if(n==0){
            return 1;
        }
        int[] f = new int[n+1];
        f[0] =1;
        f[1] =1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i-1]+f[i-2];
            f[i]%=1000000007;
        }
        return f[n];
    }
}
