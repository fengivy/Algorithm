package com.ivy.algorithm.other.SumofTwoIntegers;

public class Solution {
    public int getSum(int a, int b) {
        while ((a & b) != 0) {
            int value = a&b;
            a = a^b;
            b = value<<1;
        }
        return a^b;
    }
}
