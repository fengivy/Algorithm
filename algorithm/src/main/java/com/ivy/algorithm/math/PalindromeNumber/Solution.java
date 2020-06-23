package com.ivy.algorithm.math.PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        double result = 0;
        int originValue = x;
        while (originValue!=0){
            int value = originValue%10;
            originValue/=10;
            result = result*10+value;
        }
        return x == result;
    }
}
