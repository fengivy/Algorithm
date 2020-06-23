package com.ivy.algorithm.linkedList.LinkedListCycleII;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class SolutionTest {
    public static void main(String[] args) {
        ListNode three = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode zero = new ListNode(0);
        ListNode four = new ListNode(4);
        three.next = two;
        two.next = zero;
        zero.next = four;
        four.next = two;
        ListNode result = new Solution().detectCycle(three);
        System.out.println("-------------:"+result.val);
    }
}
