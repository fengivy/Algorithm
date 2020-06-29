package com.ivy.algorithm.swordOffer.replaceSpace;

public class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        if (s == null) {
            return sb.toString();
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                sb.append("%20");
            }else{
               sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
