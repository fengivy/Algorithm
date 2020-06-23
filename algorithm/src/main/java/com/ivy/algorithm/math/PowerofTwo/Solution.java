package com.ivy.algorithm.math.PowerofTwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return true;
        }
        double result = 1;
        while (true) {
            if (result == n) {
                return true;
            } else if (result < n) {
                result*=2;
            }else{
                return false;
            }
        }
    }
}
