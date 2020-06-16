package com.ivy.algorithm.string.ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            while (i<j && !isRightChat(s.charAt(i))){
                i++;
            }
            while (i<j && !isRightChat(s.charAt(j))){
                j--;
            }
            if (i < j) {
                if (!isSame(s.charAt(i),s.charAt(j))){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }

    private boolean isSame(char a, char b) {
        if (Character.isDigit(a)&&Character.isDigit(b)){
            return a==b;
        } else if (Character.isLetter(a) && Character.isLetter(b)) {
            a = a>='a'?a: (char) (a + ('a' - 'A'));
            b = b>='a'?b: (char) (b + ('a' - 'A'));
            return a==b;
        }else{
            return false;
        }
    }

    private boolean isRightChat(char c) {
        return Character.isLetterOrDigit(c);
    }
}
