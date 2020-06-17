package com.ivy.algorithm.array.WordBreak;

import java.util.List;

public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict == null || wordDict.size() == 0 || s == null) {
            return false;
        }
        int size = s.length();
        boolean[] f =new boolean[size+1];
        f[0] = true;
        for(int i=1;i<=size;i++){
            f[i] = false;
            for (int j = 0; j < i; j++) {
                if (f[j]&&canFindWord(s,j,i-1,wordDict)){
                    f[i] = true;
                    break;
                }
            }
        }
        return f[size];
    }

    private boolean canFindWord(String s, int begin, int end, List<String> wordDict) {
        String target = s.substring(begin,end+1);
        for(int i=0;i<wordDict.size();i++){
            if (wordDict.get(i).equals(target)) {
                return true;
            }
        }
        return false;
    }
}
