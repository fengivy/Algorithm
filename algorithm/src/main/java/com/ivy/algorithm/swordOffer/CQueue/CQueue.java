package com.ivy.algorithm.swordOffer.CQueue;

import java.util.Stack;

public class CQueue {
    private Stack<Integer> appendStack = new Stack<>();
    private Stack<Integer> headStack = new Stack<>();
    public CQueue() {

    }

    public void appendTail(int value) {
        appendStack.add(value);
    }

    public int deleteHead() {
        if (appendStack.size() == 0 && headStack.size() == 0) {
            return -1;
        }
        if (!headStack.isEmpty()) {
            return headStack.pop();
        }
        while (!appendStack.isEmpty()) {
            headStack.add(appendStack.pop());
        }
        return headStack.pop();
    }
}
