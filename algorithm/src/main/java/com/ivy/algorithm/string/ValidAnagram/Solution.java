package com.ivy.algorithm.string.ValidAnagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        int[] nums = new int[26];
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i)-'a']+=1;
        }
        for (int i = 0; i < t.length(); i++) {
            nums[t.charAt(i)-'a']-=1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
