package com.ivy.algorithm.math.CountPrimes;

public class Solution {
    public int countPrimes(int n) {
        int result = 1;
        if (n <= 2) {
            return 0;
        }
        for (int i = 3; i < n; i+=2) {
            if (isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    private boolean isPrime(int i) {
        for (int j = 3; j *j<=i; j+=2) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
