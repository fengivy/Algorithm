package com.ivy.algorithm.linkedList.LinkedListCycle;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode slow = new ListNode(-1);
        slow.next = head;
        while (first != null && slow != null) {
            if (first.next == null) {
                first = null;
            }else{
                first = first.next.next;
            }
            slow = slow.next;
            if (first!=null &&slow != null && first == slow){
                return true;
            }
        }
        return false;
    }
}
