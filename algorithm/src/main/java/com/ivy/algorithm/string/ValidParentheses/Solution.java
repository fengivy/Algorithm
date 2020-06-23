package com.ivy.algorithm.string.ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        int littleNum=0,middleNum=0,bigNum=0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')'){
                littleNum--;
                if(!insertCharToStack(stack,'(',c)){
                    return false;
                }
            }else if(c == ']'){
                middleNum--;
                if(!insertCharToStack(stack,'[',c)){
                    return false;
                }
            }else if(c=='}'){
                bigNum--;
                if(!insertCharToStack(stack,'{',c)){
                    return false;
                }
            }else if(c == '('){
                littleNum++;
                stack.push(c);
            }else if(c == '['){
                middleNum++;
                stack.push(c);
            }else if(c == '{'){
                bigNum++;
                stack.push(c);
            }
            if (littleNum < 0 || middleNum < 0 || bigNum < 0) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean insertCharToStack(Stack<Character> stack,char target,char value) {
        if (stack.isEmpty()) {
            return false;
        }else{
            if (stack.peek() == target) {
                stack.pop();
            }else{
                stack.push(value);
            }
        }
        return true;
    }
}
