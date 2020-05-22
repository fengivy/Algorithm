package com.ivy.algorithm.binarySearch.sqrt;

public class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int start = 0;
        int end = x;
        while (start + 1 < end) {
            long middle = start +(end-start)/2;
            long value = middle*middle;
            if (value == x) {
                return (int) middle;
            } else if (value > x) {
                end = (int) middle;
            }else{
                start = (int) middle;
            }
        }
        return start;
    }
}
