package com.ivy.algorithm.linkedList.Reverseasinglylinkedlist;

import com.ivy.algorithm.linkedList.bean.ListNode;


public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode result = null;
        ListNode temp ;
        while (head != null) {
            temp = head;
            head = head.next;
            temp.next = result;
            result = temp;
        }
        return result;
    }
}
