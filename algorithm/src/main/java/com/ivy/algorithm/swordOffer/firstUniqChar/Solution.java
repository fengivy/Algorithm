package com.ivy.algorithm.swordOffer.firstUniqChar;

import java.util.HashMap;

public class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        if (s == null || s.length() == 0) {
            return ' ';
        }
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),2);
            }else{
                hashMap.put(s.charAt(i),1);
            }
        }
        for (int i = 0; i < size; i++) {
            if (hashMap.get(s.charAt(i)) ==1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
