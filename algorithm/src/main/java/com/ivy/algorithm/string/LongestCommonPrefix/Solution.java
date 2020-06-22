package com.ivy.algorithm.string.LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return sb.toString();
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int size = strs.length;
        int begin = 0;
        while (true) {
            boolean isSame = true;
            for (int i = 0; i < size - 1; i++) {
                if (strs[i].length() > begin && strs[i + 1].length() > begin && strs[i].charAt(begin)== strs[i+1].charAt(begin)) {
                    continue;
                }else{
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                sb.append(strs[0].charAt(begin));
                begin++;
            }else{
                break;
            }
        }
        return sb.toString();
    }
}
