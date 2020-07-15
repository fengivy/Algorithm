package com.ivy.algorithm.swordOffer.printNumbers;

public class Solution {
    public int[] printNumbers(int n) {
        int size = (int) Math.pow(10,n);
        int[] result = new int[size-1];
        for (int i = 1; i < size; i++) {
            result[i-1] = i;
        }
        return result;
    }
}
