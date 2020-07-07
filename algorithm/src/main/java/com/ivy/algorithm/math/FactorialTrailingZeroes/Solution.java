package com.ivy.algorithm.math.FactorialTrailingZeroes;

public class Solution {
    public int trailingZeroes(int n) {
        double divide = 5;
        int result = 0;
        while (n>=divide) {
            result+=(n/divide);
            divide*=5;
        }
        return result;
    }
}
