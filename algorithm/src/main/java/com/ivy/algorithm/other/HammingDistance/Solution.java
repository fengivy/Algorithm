package com.ivy.algorithm.other.HammingDistance;

public class Solution {
    public int hammingDistance(int x, int y) {
        int result = x^y;
        int count = 0;
        int value = 1;
        for (int i = 0; i <32; i++) {
            if ((result & value) > 0) {
                count++;
            }
            value =value<<1;
        }
        return count;
    }
}
