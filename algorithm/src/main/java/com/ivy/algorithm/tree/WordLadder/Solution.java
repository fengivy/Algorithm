package com.ivy.algorithm.tree.WordLadder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        return bfs(endWord,wordList,queue);
    }

    private int bfs(String endWord, List<String> wordList, Queue<String> queue) {
        HashMap<String,Boolean> hashMap = new HashMap<>();
        int num = 1;
        while (!queue.isEmpty()) {
            num++;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String top = queue.remove();
                for (String str : wordList) {
                    if(hashMap.get(str)==null && canTransition(top,str)&&!str.equals(top)){
                        hashMap.put(str,true);
                        if (str.equals(endWord)){
                            return num;
                        }
                        queue.add(str);
                    }
                }
            }
            if (num == wordList.size()){
                return 0;
            }
        }
        return 0;
    }

    private boolean canTransition(String top, String str) {
        if (top.length() != str.length()) {
            return false;
        }
        int size = 0;
        for (int i = 0; i < top.length(); i++) {
            if (top.charAt(i) != str.charAt(i)) {
                size++;
                if (size > 1) {
                    return false;
                }
            }
        }
        return size ==1;
    }
}
