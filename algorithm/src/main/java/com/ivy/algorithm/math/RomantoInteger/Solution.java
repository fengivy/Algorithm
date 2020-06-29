package com.ivy.algorithm.math.RomantoInteger;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /*I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000*/

    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }
        while (!queue.isEmpty()) {
            char c = queue.remove();
            switch (c) {
                case 'I':
                    if (!queue.isEmpty()&&queue.peek() == 'V'){
                        queue.remove();
                        result+=4;
                    }else if(!queue.isEmpty()&&queue.peek() == 'X'){
                        queue.remove();
                        result+=9;
                    }else{
                        result+=1;
                    }
                    break;
                case 'V':
                    result+=5;
                    break;
                case 'X':
                    if (!queue.isEmpty()&&queue.peek() == 'L'){
                        queue.remove();
                        result+=40;
                    }else if(!queue.isEmpty()&&queue.peek() == 'C'){
                        queue.remove();
                        result+=90;
                    }else{
                        result+=10;
                    }
                    break;
                case 'L':
                    result+=50;
                    break;
                case 'C':
                    if (!queue.isEmpty()&&queue.peek() == 'D'){
                        queue.remove();
                        result+=400;
                    }else if(!queue.isEmpty()&&queue.peek() == 'M'){
                        queue.remove();
                        result+=900;
                    }else{
                        result+=100;
                    }
                    break;
                case 'D':
                    result+=500;
                    break;
                case 'M':
                    result+=1000;
                    break;
            }
        }
        return result;
    }
}
