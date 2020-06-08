package com.ivy.algorithm.DynamicPlanning.ThreeStepsProblemLCCI;

public class Solution {
    public int waysToStep(int n) {
        int[] ways = new int[n+1];
        for (int i = 0; i < ways.length; i++) {
            ways[i] = 0;
        }
        if (n == 0) {
            return 0;
        }
        ways[0] = 1;
        ways[1] = ways[0];
        if (n == 1) {
            return ways[1];
        }
        ways[2] = ways[0]+ways[1];
        if (n == 2) {
            return ways[2];
        }
        for (int i = 3; i <= n; i++) {
            ways[i] = ((ways[i-3]+ways[i-2])%1000000007+ways[i-1])%1000000007;
        }
        return ways[n];
    }
}
