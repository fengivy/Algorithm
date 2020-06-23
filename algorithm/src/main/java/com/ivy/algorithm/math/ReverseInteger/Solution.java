package com.ivy.algorithm.math.ReverseInteger;

public class Solution {
    public int reverse(int x) {
        int sign = x>=0?1:-1;
        x = Math.abs(x);
        double result = 0;
        while (x > 0) {
            int value = x%10;
            x = x/10;
            result = result*10+value;
        }
        if (result > Integer.MAX_VALUE) {
            return 0;
        }else{
            return (int) (result*sign);
        }
    }
}
