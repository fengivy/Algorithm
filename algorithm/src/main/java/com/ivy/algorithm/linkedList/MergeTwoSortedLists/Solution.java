package com.ivy.algorithm.linkedList.MergeTwoSortedLists;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode point = result;
        ListNode temp;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                temp = l2.next;
                l2.next = null;
                point.next = l2;
                l2 = temp;
                point = point.next;
            } else if (l2 == null) {
                temp = l1.next;
                l1.next = null;
                point.next = l1;
                l1 = temp;
                point = point.next;
            }else{
                if (l1.val < l2.val) {
                    temp = l1.next;
                    l1.next = null;
                    point.next = l1;
                    l1 = temp;
                    point = point.next;
                }else{
                    temp = l2.next;
                    l2.next = null;
                    point.next = l2;
                    l2 = temp;
                    point = point.next;
                }
            }
        }
        return result.next;
    }
}
