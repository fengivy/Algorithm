package com.ivy.algorithm.tree.SurroundedRegions;

public class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        //set O to A
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            setRegionOToA(board,i,0);
        }

        for (int i = 0; i < row; i++) {
            setRegionOToA(board,i,col-1);
        }

        for (int i = 0; i < col; i++) {
            setRegionOToA(board,0,i);
        }

        for (int i = 0; i < col; i++) {
            setRegionOToA(board,row-1,i);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }else if(board[i][j] == 'A'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void setRegionOToA(char[][] board, int i, int j) {
        if (i<0||j<0||i>board.length-1||j>board[0].length-1)
            return;
        if (board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'A';
        setRegionOToA(board,i-1,j);
        setRegionOToA(board,i+1,j);
        setRegionOToA(board,i,j-1);
        setRegionOToA(board,i,j+1);
    }
}
