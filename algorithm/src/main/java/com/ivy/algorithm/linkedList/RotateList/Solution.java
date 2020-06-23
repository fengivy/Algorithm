package com.ivy.algorithm.linkedList.RotateList;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int size = 0;
        ListNode point = head;
        while (point != null) {
            size ++;
            point = point.next;
        }

        k = k%size;
        if (k == 0) {
            return head;
        }
        point = head;
        int preSize = 1;
        while (preSize < (size-k)) {
            point = point.next;
            preSize++;
        }
        ListNode result = point.next;
        point.next = null;
        point = result;
        while (point.next != null) {
            point = point.next;
        }
        point.next = head;
        return result;
    }
}
