package com.ivy.algorithm.swordOffer.diceDotNum;

public class Solution {
    public double[] twoSum(int n) {
        double[] result = new double[n*6-(n-1)];
        calculate(n-1,n,result,0);
        double total = Math.pow(6,n);
        for (int i = 0; i < result.length; i++) {
            result[i] = result[i]/total;
        }
        return result;
    }

    private void calculate(int distance,int n, double[] result,int value) {
        if (n == 0) {
            return;
        }
        for(int i=1;i<=6;i++){
            int total = value+i;
            if (n == 1) {
                result[total-distance-1]+=1;
            }else{
                calculate(distance,n-1,result,value+i);
            }
        }
    }
}
