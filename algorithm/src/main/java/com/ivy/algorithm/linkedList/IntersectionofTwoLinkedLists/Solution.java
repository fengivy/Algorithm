package com.ivy.algorithm.linkedList.IntersectionofTwoLinkedLists;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = new ListNode(-1);
        a.next = headA;
        ListNode b = new ListNode(-1);
        b.next= headB;
        int switchNum = 0;
        do {
            if (a.next == null) {
                switchNum++;
                a.next = headB;
            }
            if (b.next == null) {
                switchNum++;
                b.next = headA;
            }
            if (switchNum == 2 && a.next == b.next) {
                return a.next;
            }
            a.next = a.next.next;
            b.next = b.next.next;
        } while (switchNum <= 2);
        return null;
    }


}
