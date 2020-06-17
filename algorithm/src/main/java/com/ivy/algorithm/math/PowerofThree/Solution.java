package com.ivy.algorithm.math.PowerofThree;

public class Solution {
    public boolean isPowerOfThree(int n) {
        double result = 1;
        while (result<=n) {
            if (result == n) {
                return true;
            }
            result*=3;
        }
        return false;
    }
}
