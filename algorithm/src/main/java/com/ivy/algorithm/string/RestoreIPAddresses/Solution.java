package com.ivy.algorithm.string.RestoreIPAddresses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.isEmpty() || s.length() < 4) {
            return result;
        }
        getIP(s,result,new ArrayList<String>());
        return result;
    }

    private void getIP(String s,List<String> result, ArrayList<String> strings) {
        if (strings.size() == 4) {
            result.add(formatIP(strings));//添加结果
            return;
        }
        int totalSize = getTotalSize(strings);
        int size = s.length()- totalSize;
        int min = Math.max(1,size-(4-strings.size()-1)*3); //最小几位数
        int max = Math.min(3,size - (4 - strings.size() - 1)); //最大几位数
        for(int i=min;i<=max;i++){
            String item = s.substring(totalSize,totalSize+i);
            if (item.length()>=2 && item.charAt(0) == '0')
                continue;
            int value = Integer.parseInt(item);
            if (value<=255){ //合理的ip地址才处理
                strings.add(item);
                getIP(s,result,strings);
                strings.remove(strings.size()-1);
            }
        }
    }

    private String formatIP(ArrayList<String> strings) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(strings.get(i));
            if (i != 3) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    private int getTotalSize(ArrayList<String> strings){
        int size = 0;
        for (String s : strings) {
            size+=s.length();
        }
        return size;
    }
}
