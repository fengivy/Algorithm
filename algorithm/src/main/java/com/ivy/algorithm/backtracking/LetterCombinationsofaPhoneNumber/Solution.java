package com.ivy.algorithm.backtracking.LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        char[][] letter= new char[8][4];
        createLetter(letter);
        StringBuilder sb = new StringBuilder();
        getResult(result,digits,letter,sb);
        return result;
    }

    private void createLetter(char[][] letter) {
        char begin = 'a';
        for (int i = 0; i < 8; i++) {
            int value =i+2;
            int num = (value==7||value==9)?4:3;
            for (int j = 0; j < 4; j++) {
                if (j < num) {
                    letter[i][j] = begin;
                    begin+=1;
                }else{
                    letter[i][j] = '0';
                }
            }
        }
    }

    private void getResult(List<String> result, String digits,char[][] letter,StringBuilder sb) {
        if (sb.length() == digits.length()) {
            result.add(sb.toString());
            return;
        }
        int index = digits.charAt(sb.length())-'2';
        for (int i = 0; i < letter[index].length; i++) {
            if (letter[index][i] != '0') {
                sb.append(letter[index][i]);
                getResult(result,digits,letter,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
