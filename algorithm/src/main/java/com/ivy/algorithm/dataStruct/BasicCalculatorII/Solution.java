package com.ivy.algorithm.dataStruct.BasicCalculatorII;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Deque<Character> deque = new LinkedList<>();
        boolean previewDeal = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' '){
                continue;
            }
            if (Character.isDigit(c)){
                deque.push(c);
            }else{
              if (previewDeal){ //上一组数组需要处理 *,/先计算
                  dealPreview(deque);
                  previewDeal = false;
              }
              if (c == '*' || c=='/'){
                  previewDeal = true;
                  deque.push(c);
              }else{
                  deque.push(c);
              }
            }
        }
        if (previewDeal){ //先处理最后一组结果
            dealPreview(deque);
            previewDeal = false;
        }
        //从左往右开始处理
        while (!deque.isEmpty()&&hasOperation(deque)) {
            int left = 1;
            if (!Character.isDigit(deque.getLast())){
                char c = deque.removeLast();
                if (c == '-') {
                    left =-1;
                }
            }
            left = left*getLastNum(deque);
            char operation = deque.removeLast();
            int right = getLastNum(deque);
            int value = calculate(left,right,operation);
            addValue(deque,value,true);
        }
        if (!Character.isDigit(deque.getLast())){
            char c = deque.removeLast();
            int result = getLastNum(deque);
            if (c == '-'){
                result *=-1;
            }
            return result;
        }
        return getLastNum(deque);
    }

    private boolean hasOperation(Deque<Character> deque) {
        int size = deque.size();
        int i = 0;
        for (Character c : deque) {
            if (!Character.isDigit(c) && i<size-1) {
                return true;
            }
            i+=1;
        }
        return false;
    }

    private void dealPreview(Deque<Character> deque) {
        int right = getFirstNum(deque);
        char operation = deque.removeFirst();
        int left = getFirstNum(deque);
        int value = calculate(left,right,operation);
        addValue(deque,value,false);
    }

    private void addValue(Deque<Character> deque, int value,boolean isFirst) {
        String s = String.valueOf(value);
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (isFirst) {
                deque.addLast(s.charAt(size-1-i));
            }else{
                deque.addFirst(s.charAt(i));
            }
        }
    }

    private int calculate(int left, int right, char operation) {
        if (operation == '+') {
            return left+right;
        }else if(operation == '-'){
            return left-right;
        }else if(operation == '*'){
            return left*right;
        }else{
            return left/right;
        }
    }

    private int getLastNum(Deque<Character> deque){
        int num = 0;
        while (!deque.isEmpty() && Character.isDigit(deque.getLast())) {
            char c = deque.removeLast();
            num = num*10+(c-'0');
        }
        return num;
    }

    private int getFirstNum(Deque<Character> deque){
        int num = 0;
        int i=1;
        while (!deque.isEmpty() && Character.isDigit(deque.getFirst())) {
            char c = deque.removeFirst();
            num = num+(c-'0')*i;
            i*=10;
        }
        return num;
    }
}
