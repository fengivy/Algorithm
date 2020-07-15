package com.ivy.algorithm.swordOffer.MinStack;

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
        }else{
            minStack.push(Math.min(x,minStack.peek()));
        }
    }

    public void pop() {
        if (!stack.isEmpty())
            stack.pop();
        if (!minStack.isEmpty())
            minStack.pop();
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    public int min() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }
}
