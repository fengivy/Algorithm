package com.ivy.algorithm.other.EvaluateReversePolishNotation;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        Stack<String>  stack = new Stack<>();
        for (String s : tokens) {
            if (isNumeric(s)) {
                stack.add(s);
            }else{
                int last = Integer.parseInt(stack.pop());
                int first = Integer.parseInt(stack.pop());
                int result = calculate(first,last,s);
                stack.add(String.valueOf(result));
            }
        }
        return Integer.parseInt(stack.pop());
    }

    private int calculate(int first, int last, String operation) {
        if ("+".equals(operation)) {
            return first+last;
        }else if("-".equals(operation)){
            return first-last;
        }else if("*".equals(operation)){
            return first*last;
        }else{
            return first/last;
        }
    }

    public boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("^[-]?[0-9]+$");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
}
