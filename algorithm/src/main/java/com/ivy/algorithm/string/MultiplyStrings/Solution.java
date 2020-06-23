package com.ivy.algorithm.string.MultiplyStrings;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0) {
            return "";
        }
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        List<String> list = new ArrayList<>();
        int maxLength = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();
            int decade = 0;
            if (num1.charAt(i) =='0'){
                continue;
            }
            for (int j = num2.length() - 1; j >= 0; j--) {
                int value = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                if (decade != 0) {
                    value = value+decade;
                    decade = 0;
                }
                if (value>=10){
                    decade = value/10;
                    value = value%10;
                }
                sb.insert(0,value);
            }
            if (decade != 0) {
                sb.insert(0,decade);
            }
            for (int k = 0; k < num1.length()-1 - i; k++) {
                sb.append(0);
            }
            list.add(sb.toString());
            maxLength = Math.max(maxLength,sb.toString().length());
        }
        //合并每一项
        StringBuilder result = new StringBuilder();
        int decade = 0;
        for (int i = 0; i < maxLength; i++) {
            int value = 0;
            for (int j = 0; j < list.size(); j++) {
                String item = list.get(j);
                if (item.length() > i) {
                    value = value + (item.charAt(item.length()-1-i)-'0');
                }
            }
            if (decade != 0) {
                value = value+decade;
                decade = 0;
            }
            if (value>=10){
                decade = value/10;
                value = value%10;
            }
            result.insert(0,value);
        }
        if(decade != 0){
            result.insert(0,decade);
        }
        return result.toString();
    }
}
