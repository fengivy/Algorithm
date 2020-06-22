package com.ivy.algorithm.string.ReverseWordsinaString;

public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i >=0; i--) {
            if (words[i].trim().length()!=0) {
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        if (sb.length()>0)
            sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
