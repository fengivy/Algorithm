package com.ivy.algorithm.array.PlusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }
        int position = digits.length-1;
        while (digits[position] + 1 == 10) {
            digits[position] = 0;
            position--;
            if (position<0){
                int[] newDigits = new int[digits.length+1];
                newDigits[0] = 0;
                System.arraycopy(digits,0,newDigits,1,digits.length);
                digits = newDigits;
                position=0;
            }
        }
        digits[position]+=1;
        return digits;
    }
}
