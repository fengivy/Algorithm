package com.ivy.algorithm.string.LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String value = getPalindrome(s,i);
            if (value.length() > result.length()) {
                result = value;
            }
        }
        return result;
    }

    private String getPalindrome(String s, int i) {
        int left = i;
        int right = i;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left++;
        right--;
        String value = s.substring(left,right+1);
        left = i;
        right = i+1;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left++;
        right--;
        if (left < right && right - left+1 > value.length()) {
            value = s.substring(left,right+1);
        }
        return value;
    }
}
