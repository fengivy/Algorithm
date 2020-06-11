package com.ivy.algorithm.linkedList.SortList;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        return mergeSortList(head);
    }

    private ListNode mergeSortList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        ListNode pre = null;
        while (fast != null && slow != null) {
            pre = slow;
            fast = fast.next == null?null:fast.next.next;
            slow = slow.next;
        }
        pre.next = null;//断开前后部分
        ListNode left = mergeSortList(head);
        ListNode right = mergeSortList(slow);
        return merge(left,right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode origin = new ListNode(-1);
        ListNode point = origin;
        ListNode temp;
        while (left != null || right != null) {
            if (left == null) {
                temp = right.next;
                point.next = right;
                point =right;
                right = temp;
            } else if (right == null) {
                temp = left.next;
                point.next = left;
                point =left;
                left = temp;
            }else{
                if (left.val < right.val) {
                    temp = left.next;
                    point.next = left;
                    point =left;
                    left = temp;
                }else{
                    temp = right.next;
                    point.next = right;
                    point =right;
                    right = temp;
                }
            }
        }
        return origin.next;
    }
}
