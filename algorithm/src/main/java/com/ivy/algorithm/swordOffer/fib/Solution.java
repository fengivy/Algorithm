package com.ivy.algorithm.swordOffer.fib;

public class Solution {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        }else{
            int lastTwo = 0;
            int lastOne = 1;
            for (int i = 2; i <= N; i++) {
                int value = (lastOne+lastTwo)%1000000007;
                lastTwo = lastOne;
                lastOne = value;
            }
            return lastOne;
        }
    }
}
