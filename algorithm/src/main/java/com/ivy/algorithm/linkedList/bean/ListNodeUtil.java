package com.ivy.algorithm.linkedList.bean;

import java.util.ArrayList;
import java.util.List;

public class ListNodeUtil {
    public static ListNode createNode(int[] list){
        ListNode origin = new ListNode(-1);
        ListNode temp =origin;
        int size = list.length;
        for (int i = 0; i < size; i++) {
            ListNode node = new ListNode(list[i]);
            temp.next = node;
            temp = node;
        }
        return origin.next;
    }

    public static void printListNode(ListNode listNode) {
        List<Integer> list = new ArrayList<Integer>();
        ListNode point = listNode;
        while ( point!= null) {
            list.add(point.val);
            point = point.next;
        }
        System.out.println("-------------:"+list.toString());
    }
}
