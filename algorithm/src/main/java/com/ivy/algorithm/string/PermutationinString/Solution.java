package com.ivy.algorithm.string.PermutationinString;

public class Solution {
    //判断s2是否包含s1的排列
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0) {
            return false;
        }
        char[] c = s1.toCharArray();
        int begin = 0;
        for (int i = 0; i < s2.length(); i++) {
            boolean isFind = false;
            for (int j = begin; j < c.length; j++) {
                if (c[j] == s2.charAt(i)){
                    isFind = true;
                    char temp = c[begin];
                    c[begin] = c[j];
                    c[j] = temp;
                    begin++;
                    break;
                }
            }
            if (isFind){ //找到了
                if (begin == c.length) {
                    return true;
                }
            }else{
                for (int j = 0; j < begin; j++) {
                    if (s2.charAt(i) == c[j]) { //找到了 首先交换数据，然后保持begin队形
                        char temp = c[j];
                        c[j] = c[begin];
                        c[begin] = temp;
                        //保持
                        int switchPosition = 0;
                        for(int k = j+1;k<=begin;k++){
                            temp = c[k];
                            c[k] = c[switchPosition];
                            c[switchPosition] = temp;
                            switchPosition++;
                        }
                        begin = switchPosition;
                        isFind = true;
                        break;
                    }
                }
                if (!isFind) {
                    begin = 0;
                }
            }
        }
        return false;
    }
}
