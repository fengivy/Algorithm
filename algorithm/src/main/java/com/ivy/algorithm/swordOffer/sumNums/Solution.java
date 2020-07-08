package com.ivy.algorithm.swordOffer.sumNums;

public class Solution {
    public int sumNums(int n) {
        boolean a= n!=0&&(n+=sumNums(n-1))!=0;
        return n;
    }
}
