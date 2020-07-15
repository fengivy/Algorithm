package com.ivy.algorithm.myPow;


public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        boolean isLowZero = n<0;
        double pow = Math.abs(n*1.0);
        double result = getValue(x,pow);
        return isLowZero?1/result:result;
    }

    private double getValue(double x, double n) {
        if (n == 1) {
            return x;
        }
        double value = getValue(x,(int)(n/2));
        if (n%2==0){
            return value*value;
        }else{
            return value*value*x;
        }
    }
}
