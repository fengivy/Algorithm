package com.ivy.algorithm.sort.LongestWordinDictionarythroughDeleting;

import java.util.List;

public class Solution {
    public String findLongestWord(String s, List<String> d) {
        //s = sort(s);
        String result = "";
        for (String item : d) {
            //String sortStr = sort(item);
            boolean canTransition = judgeCanTransition(s,item);
            if (!canTransition) {
                continue;
            }
            if (item.length() > result.length()) {
                result = item;
            } else if (item.length() == result.length() && isLessString(item, result)) {
                result = item;
            }
        }
        return result;
    }

    private boolean isLessString(String item, String result) {
        for (int i = 0; i < item.length(); i++) {
            if(item.charAt(i) < result.charAt(i)){
                return true;
            }else if(item.charAt(i)>result.charAt(i)){
                return false;
            }
        }
        return true;
    }

    private boolean judgeCanTransition(String s, String sortStr) {
        int length = 0;
        int lastJ = 0;
        for (int i = 0; i < sortStr.length(); i++) {
            for (int j = lastJ; j < s.length(); j++) {
                if (s.charAt(j) == sortStr.charAt(i)){
                    length++;
                    lastJ = j+1;
                    break;
                }
            }
        }
        return length == sortStr.length();
    }

    private String sort(String s) {
        char[] sChar = s.toCharArray();
        int start = 0;
        int end = sChar.length-1;
        sortStr(sChar, start, end);
        return new String(sChar);
    }

    private void sortStr(char[] sChar, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        char middle = sChar[start + (end - start)/2];
        while (i<=j){
            while (i<=j && sChar[i]<middle){
                i++;
            }
            while (i <= j && sChar[j] > middle) {
                j--;
            }
            if (i <= j) {
                char temp = sChar[i];
                sChar[i] = sChar[j];
                sChar[j] = temp;
                i++;
                j--;
            }
        }
        sortStr(sChar,start,j);
        sortStr(sChar,i,end);
    }
}
