package com.ivy.algorithm.math.GrayCode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder lastSb = new StringBuilder();
        find(result,sb,n,lastSb);
        return result;
    }

    private void find(List<Integer> result, StringBuilder sb, int n,StringBuilder lastSb) {
        if (sb.length() == n) {
            result.add(getValue(sb));
            lastSb.delete(0,lastSb.length());
            lastSb.append(sb.toString());
            return;
        }
        if (lastSb.length()!=0&&sb.charAt(sb.length()-1)!=lastSb.charAt(sb.length()-1)&&lastSb.charAt(sb.length())=='1'){
            for (int i = 1; i >=0; i--) {
                sb.append(i);
                find(result,sb,n,lastSb);
                sb.deleteCharAt(sb.length()-1);
            }
        }else{
            for (int i = 0; i <= 1; i++) {
                sb.append(i);
                find(result,sb,n,lastSb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }

    private Integer getValue(StringBuilder sb) {
        System.out.println("--------:"+sb.toString());
        int value = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            value = value*2+sb.charAt(i)-'0';
        }
        return value;
    }
}
