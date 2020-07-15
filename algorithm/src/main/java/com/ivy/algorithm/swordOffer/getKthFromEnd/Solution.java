package com.ivy.algorithm.swordOffer.getKthFromEnd;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int length = 0;
        ListNode point = head;
        while (point != null) {
            point = point.next;
            length++;
        }
        length = length-k+1;
        point = head;
        while (point != null) {
            length--;
            if (length==0) {
                return point;
            }
            point = point.next;
        }
        return null;
    }
}
