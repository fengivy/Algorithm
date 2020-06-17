package com.ivy.algorithm.string.WordSearchII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        if (board == null || board.length == 0 || words == null || words.length == 0) {
            return result;
        }
        for (int i = 0; i < words.length; i++) {
            if(dfsSearch(words[i],board)){
                result.add(words[i]);
            }
        }
        return result;
    }

    private boolean dfsSearch(String word, char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(word,board,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(String word, char[][] board, int i, int j,int length) {
        return false;
    }
}
