package com.ivy.algorithm.other.UTFEightValidation;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean validUtf8(int[] data) {
        if (data == null || data.length == 0) {
            return false;
        }
        Queue<String> queue = new LinkedList<>();
        for(int i=0;i<data.length;i++){
            queue.add(getLowEightBit(data[i]));
        }
        while (!queue.isEmpty()) {
            String item = queue.remove();
            if (item.charAt(0) == '0') {
                //1字节不用处理
            }else{
                int bitNum = 0;
                for (int i = 1; i < item.length(); i++) {
                    if (item.charAt(i) == '1') {
                        bitNum++;
                    }else{
                        break;
                    }
                }
                if (bitNum == 0||bitNum>3) {
                    return false;
                }
                for (int i = 0; i < bitNum; i++) {
                    if (queue.isEmpty()) {
                        return false;
                    }
                    item = queue.remove();
                    if (!item.startsWith("10")){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private String getLowEightBit(int datum) {
        StringBuilder sb = new StringBuilder();
        while (datum > 0 && sb.length() <= 8) {
            int value = datum%2;
            datum = datum/2;
            sb.insert(0,value);
        }
        if (sb.length() < 8) {
            int size = 8-sb.length();
            for (int i = 0; i < size; i++) {
                sb.insert(0,0);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
