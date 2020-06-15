package com.ivy.algorithm.string.GroupAnagrams;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        int size = strs.length;
        String[] mark = new String[size];
        for (int i = 0; i < size; i++) {
            markStr(mark,strs,i);
        }
        for (int i = 0; i < size; i++) {
            if (strs[i] != null) {
                List<String> items = new ArrayList<>();
                items.add(strs[i]);
                strs[i] = null;
                for (int j = i + 1; j < size; j++) {
                    if (strs[j] != null && isGroupAnagrams(mark[i],mark[j])) {
                        items.add(strs[j]);
                        strs[j] = null;
                    }
                }
                result.add(items);
            }
        }
        return result;
    }

    private boolean isGroupAnagrams(String s, String str) {
        return s.equals(str);
    }

    private void markStr(String[] mark, String[] strs, int k) {
        int[] sort = new int[26];
        int size = strs[k].length();
        for (int i = 0; i < size; i++) {
            sort[strs[k].charAt(i)-'a']+=1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sort.length; i++) {
            while (sort[i] != 0) {
                char value = (char) ('a'+i);
                sb.append(value);
                sort[i]-=1;
            }
        }
        mark[k] = sb.toString();
    }

}
