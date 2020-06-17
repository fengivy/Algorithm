package com.ivy.algorithm.string.WordSearchII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        int[][] visit = new int[row][col];
        int visitNum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                visitNum++;
                if (dfs(word,board,i,j,0,visit,visitNum)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(String word, char[][] board, int i, int j, int wordMatchLength, int[][] visit, int visitNum) {
        if (wordMatchLength > word.length() - 1) {
            return true;
        }
        if (i<0||j<0||i>board.length-1||j>board[0].length-1){
            return false;
        }
        if (visit[i][j] ==visitNum)
            return false;
        if (board[i][j] == word.charAt(wordMatchLength)){
            visit[i][j] = visitNum;
            boolean result =  dfs(word,board,i-1,j,wordMatchLength+1,visit,visitNum)
            || dfs(word,board,i+1,j,wordMatchLength+1,visit,visitNum)
            || dfs(word,board,i,j-1,wordMatchLength+1,visit,visitNum)
            || dfs(word,board,i,j+1,wordMatchLength+1,visit,visitNum);
            visit[i][j] = visitNum-1;
            return result;
        }else{
            return false;
        }
    }
}
