package com.ivy.algorithm.string.ReverseString;

public class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int count = s.length/2;
        int size = s.length;
        char temp;
        for (int i = 0; i < count; i++) {
            temp = s[i];
            s[i] =s[size-1-i];
            s[size-1-i] = temp;
        }
    }
}
