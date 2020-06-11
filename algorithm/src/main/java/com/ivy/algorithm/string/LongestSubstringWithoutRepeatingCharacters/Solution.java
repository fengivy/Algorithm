package com.ivy.algorithm.string.LongestSubstringWithoutRepeatingCharacters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        //使用动规
        int maxResult = 0;
        if (s == null || s.length() == 0) {
            return 0;
        }
        int size = s.length();
        int[] f = new int[size+1];
        f[0] = 0;
        for (int i = 1; i <= size; i++) {
            if (f[i - 1] == 0) {
                f[i] = 1;
            }else{
                int end = (i-1)-f[i-1]+1;
                int length = 1;
                for(int j=i-1;j>=end;j--){
                    if (s.charAt(i-1)!=s.charAt(j-1)){
                        length++;
                    }else{
                        break;
                    }
                }
                f[i] = length;
            }
            maxResult = Math.max(f[i],maxResult);
        }
        return maxResult;
    }
}
