package com.ivy.algorithm.string.ImplementstrStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        int srcSize = haystack.length();
        int destSize = needle.length();
        if (srcSize < destSize) {
            return -1;
        }
        for (int i = 0; i <= srcSize - destSize; i++) {
            boolean isRight = true;
            for (int j = 0; j < destSize; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    isRight = false;
                    break;
                }
            }
            if (isRight) {
                return i;
            }
        }
        return -1;
    }
}
