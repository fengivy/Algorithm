package com.ivy.algorithm.swordOffer.nthUglyNumber;

public class Solution {
    public int nthUglyNumber(int n) {
        int[] f = new int[n];
        f[0] =1;
        int aTwo=0,aThree=0,aFive =0;
        for(int i=1;i<n;i++){
            f[i] = Math.min(Math.min(f[aTwo]*2,f[aThree]*3),f[aFive]*5);
            if (f[aTwo]*2==f[i]) aTwo++;
            if (f[aThree]*3==f[i]) aThree++;
            if (f[aFive]*5==f[i]) aFive++;
        }
        return f[n-1];
    }
}
