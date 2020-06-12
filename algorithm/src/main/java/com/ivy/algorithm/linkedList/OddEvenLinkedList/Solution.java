package com.ivy.algorithm.linkedList.OddEvenLinkedList;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode originOdd = new ListNode(-1);
        ListNode pointOdd = originOdd;

        ListNode originEven = new ListNode(-1);
        ListNode pointEven = originEven;
        boolean isOdd = true;
        ListNode temp;
        while (head != null) {
            temp = head.next;
            head.next = null;
            if (isOdd) {
                pointOdd.next = head;
                pointOdd = pointOdd.next;
            }else{
                pointEven.next = head;
                pointEven = pointEven.next;
            }
            head = temp;
            isOdd = !isOdd;
        }
        pointOdd.next = originEven.next;
        return originOdd.next;
    }
}
