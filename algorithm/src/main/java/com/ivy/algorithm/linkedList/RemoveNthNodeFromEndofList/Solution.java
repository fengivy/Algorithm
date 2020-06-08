package com.ivy.algorithm.linkedList.RemoveNthNodeFromEndofList;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode origin = new ListNode(-1);
        origin.next = head;
        int size = 0;
        ListNode point = origin;
        while (point.next != null) {
            size++;
            point = point.next;
        }
        if (n <= 0 || n > size) {
            return head;
        }

        point = new ListNode(-1);
        point.next = origin;
        size = size-n+1;
        while (size>0) {
            point = point.next;
            size--;
        }
        ListNode temp = point.next.next;
        point.next.next = null;
        point.next = temp;
        return origin.next;
    }

}
