package com.ivy.algorithm.swordOffer.reversePrint;

import com.ivy.algorithm.linkedList.bean.ListNode;

import java.util.Stack;

public class Solution {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[]{};
        }
        Stack<Integer> stack = new Stack<>();
        ListNode point = head;
        while (point != null) {
            stack.push(point.val);
            point = point.next;
        }
        int[] result = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            result[index] = stack.pop();
            index++;
        }
        return result;
    }
}
