package com.ivy.algorithm.linkedList.DeleteLinkedListNode;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode origin = new ListNode(-1);
        origin.next = head;
        ListNode point = origin;
        while (point.next!=null &&point.next.val != val) {
            point = point.next;
        }
        if (point.next != null) { //找到了,删除
            ListNode temp  = point.next.next;
            point.next.next = null;
            point.next = temp;
        }
        return origin.next;
    }
}
