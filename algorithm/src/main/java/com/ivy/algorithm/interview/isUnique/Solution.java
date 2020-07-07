package com.ivy.algorithm.interview.isUnique;

import java.util.HashMap;

public class Solution {
    public boolean isUnique(String astr) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < astr.length(); i++) {
            if (hashMap.containsKey(astr.charAt(i))){
                return false;
            }else{
                hashMap.put(astr.charAt(i),1);
            }
        }
        return true;
    }
}
