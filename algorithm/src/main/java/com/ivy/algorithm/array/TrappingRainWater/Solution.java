package com.ivy.algorithm.array.TrappingRainWater;

import java.util.Stack;

public class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int size = height.length;
        for (int i = 1; i < size; i++) {
            if (height[i] < height[i - 1]) {
                stack.push(i-1);
            } else if (height[i] > height[i - 1]) {
                if (stack.isEmpty()) {
                    continue;
                }
                if (height[i] < height[stack.peek()]) {
                    for(int j=i-1;j>=stack.peek()+1;j--){
                        result += height[i] - height[j];
                        height[j] = height[i];
                    }
                }else{
                    int lastValue = 0;
                    while (!stack.isEmpty()&&height[i]>=height[stack.peek()]) {
                        lastValue = stack.pop();
                    }
                    if (!stack.isEmpty()) {
                        lastValue = stack.peek();
                    }
                    int value = Math.min(height[i],height[lastValue]);
                    for (int j = i - 1; j >= lastValue+1; j--) {
                        result += value-height[j];
                        height[j] = value;
                    }
                }
            }
        }
        return result;
    }
}
