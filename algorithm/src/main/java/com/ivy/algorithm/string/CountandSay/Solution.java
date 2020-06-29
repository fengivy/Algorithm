package com.ivy.algorithm.string.CountandSay;

public class Solution {
    public String countAndSay(int n) {
        String value = "1";
        if (n == 1) {
            return value;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            sb.delete(0,sb.length());
            for (int j = 0; j < value.length(); j++) {
                int length = 1;
                for (int k = j + 1; k < value.length(); k++) {
                    if (value.charAt(k) == value.charAt(j)){
                        length++;
                    }else{
                        break;
                    }
                }
                sb.append(length);
                sb.append(value.charAt(j));
                j+=(length-1);
            }
            value = sb.toString();
        }
        return value;
    }
}
