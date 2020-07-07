package com.ivy.algorithm.swordOffer.reverseLeftWords;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() == 0) {
            return s;
        }
        int size = s.length();
        n = n%size;
        if (n == 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s, n, size);
        sb.append(s, 0, n);
        return sb.toString();
    }
}
