package com.ivy.algorithm.interview.oneEditAway;

public class Solution {
    public boolean oneEditAway(String first, String second) {
        if (first == null || second == null) {
            return false;
        }
        int firstSize = first.length();
        int secondSize = second.length();
        int[][] f = new int[firstSize+1][secondSize+1];
        for (int i = 0; i <= firstSize; i++) {
            for (int j = 0; j <= secondSize; j++) {
                if (i == 0){
                    f[0][j] = j;
                }else if (j == 0){
                    f[i][0] = i;
                }else{
                    if (second.charAt(j - 1) == first.charAt(i - 1)) {
                        f[i][j] = f[i-1][j-1];
                    }else{
                        f[i][j] = Math.min(Math.min(f[i-1][j]+1,f[i][j-1]+1),f[i-1][j-1]+1);
                    }
                }
            }
        }
        return f[firstSize][secondSize]<=1;
    }
}
