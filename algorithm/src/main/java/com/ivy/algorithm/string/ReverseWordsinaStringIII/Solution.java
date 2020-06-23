package com.ivy.algorithm.string.ReverseWordsinaStringIII;

public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String[] strs = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            for (int i = str.length() - 1; i >= 0; i--) {
                result.append(str.charAt(i));
            }
            result.append(" ");
        }
        if (result.length()>0)
            result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
