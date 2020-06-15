package com.ivy.algorithm.backtracking.WordSearch;


public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.length() == 0) {
            return false;
        }
        return dfs(board,word);
    }

    private boolean dfs(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(dfsSearch(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfsSearch(char[][] board, String word, int i, int j, int length) {
        if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1) {
            return false;
        }
        if (board[i][j] != word.charAt(length)){
            return false;
        }
        if (length+1 == word.length()){
            return true;
        }
        char current = board[i][j];
        board[i][j] = '0';
        if(dfsSearch(board,word,i+1,j,length+1)){
            return true;
        }
        if(dfsSearch(board,word,i-1,j,length+1)){
            return true;
        }
        if(dfsSearch(board,word,i,j+1,length+1)){
            return true;
        }
        if(dfsSearch(board,word,i,j-1,length+1)){
            return true;
        }
        board[i][j] = current;
        return false;
    }
}
