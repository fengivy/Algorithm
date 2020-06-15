package com.ivy.algorithm.other.EvaluateReversePolishNotation;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("------------:"+new Solution().evalRPN(new String[]{"4","3","-"}));
        System.out.println("------------:"+new Solution().evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println("------------:"+new Solution().evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        System.out.println("------------:"+new Solution().evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}
