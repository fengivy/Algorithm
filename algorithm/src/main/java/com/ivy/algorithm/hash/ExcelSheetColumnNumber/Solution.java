package com.ivy.algorithm.hash.ExcelSheetColumnNumber;

public class Solution {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int size = s.length();
        int result = 0;
        for (int i = 0; i <size; i++) {
            result = result*26+(s.charAt(i)-'A'+1);
        }
        return result;
    }
}
