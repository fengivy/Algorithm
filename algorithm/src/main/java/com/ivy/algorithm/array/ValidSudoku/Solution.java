package com.ivy.algorithm.array.ValidSudoku;

import java.util.HashMap;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> hashMap =new HashMap<>();
        //横向
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]!= '.'){
                    if (hashMap.containsKey(board[i][j])) {
                        return false;
                    }
                    hashMap.put(board[i][j],0);
                }
            }
            hashMap.clear();
        }


        for (int j = 0; j < board[0].length; j++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][j]!= '.'){
                    if (hashMap.containsKey(board[i][j])) {
                        return false;
                    }
                    hashMap.put(board[i][j],0);
                }
            }
            hashMap.clear();
        }

        for(int i=0;i<board.length;i=i+3){
            for (int j = 0; j < board[0].length; j = j + 3) {
                for (int k = i; k < i + 3; k++) {
                    for (int p = j; p < j + 3; p++) {
                        if (board[k][p]!= '.'){
                            if (hashMap.containsKey(board[k][p])) {
                                return false;
                            }
                            hashMap.put(board[k][p],0);
                        }
                    }
                }
                hashMap.clear();
            }
        }
        return true;
    }
}
