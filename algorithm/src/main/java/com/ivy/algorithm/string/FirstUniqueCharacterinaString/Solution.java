package com.ivy.algorithm.string.FirstUniqueCharacterinaString;

public class Solution {
    public int firstUniqChar(String s) {
        int size = s.length();
        for (int i = 0; i < size; i++) {
            boolean hasSameChar = false;
            for(int j=0;j<size;j++){
                if(i!=j&&s.charAt(i) == s.charAt(j)){
                    hasSameChar = true;
                    break;
                }
            }
            if (!hasSameChar){
                return i;
            }
        }
        return -1;
    }
}
