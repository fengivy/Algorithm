package com.ivy.algorithm.swordOffer.lengthOfLongestSubstring;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxResult = 1;
        int lastLength = 1;
        for (int i = 1; i < s.length(); i++) {
            int lastEnd = i-lastLength;
            int length = 1;
            for (int j = i-1; j >= lastEnd; j--) {
                if (s.charAt(i)== s.charAt(j)) {
                    break;
                }else{
                    length++;
                }
            }
            lastLength = length;
            maxResult = Math.max(maxResult,lastLength);
        }
        return maxResult;
    }
}
