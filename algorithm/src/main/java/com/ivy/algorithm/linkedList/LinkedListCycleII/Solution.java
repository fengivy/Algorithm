package com.ivy.algorithm.linkedList.LinkedListCycleII;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode first = head.next;
        while (slow != null && first != null) {
            slow = slow.next;
            if (first.next == null) {
                first = null;
            }else{
                first = first.next.next;
            }
            if (slow != null && first != null && slow == first) { //相遇
                slow = head;
                first = first.next;
                while (slow != first) {
                    slow= slow.next;
                    first = first.next;
                }
                return slow;
            }
        }
        return null;
    }
}
