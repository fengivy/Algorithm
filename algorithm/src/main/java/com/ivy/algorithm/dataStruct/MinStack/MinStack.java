package com.ivy.algorithm.dataStruct.MinStack;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if (stack.isEmpty()) {
            minStack.push(x);
        }else{
            minStack.add(Math.min(x,minStack.peek()));
        }
        stack.push(x);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}