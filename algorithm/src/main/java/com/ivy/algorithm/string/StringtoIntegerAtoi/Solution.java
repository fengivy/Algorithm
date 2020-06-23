package com.ivy.algorithm.string.StringtoIntegerAtoi;

public class Solution {
    public int myAtoi(String str) {
        double result = 0;
        if (str == null) {
            return 0;
        }
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        char firstChar = str.charAt(0);

        if (Character.isDigit(firstChar)||firstChar == '+'|| firstChar == '-'){
            int sign = 1;
            int begin = 0;
            if (firstChar == '+'){
                begin =1;
            }
            else if(firstChar == '-'){
                sign = -1;
                begin =1;
            }
            for (int i = begin; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))){
                    result = result*10+(str.charAt(i)-'0');
                }else{
                    break;
                }
            }
            return (int)(result*sign);
        }else{
            return 0;
        }
    }
}
