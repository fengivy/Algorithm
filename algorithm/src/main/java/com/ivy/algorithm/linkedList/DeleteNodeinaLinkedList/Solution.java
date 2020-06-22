package com.ivy.algorithm.linkedList.DeleteNodeinaLinkedList;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        ListNode point =node;
        while (point.next != null) {
            point.val = point.next.val;
            if (point.next.next == null) {
                point.next =null;
            }else{
                point = point.next;
            }
        }
    }
}
