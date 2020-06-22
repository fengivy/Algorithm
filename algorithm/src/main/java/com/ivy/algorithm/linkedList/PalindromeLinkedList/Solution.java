package com.ivy.algorithm.linkedList.PalindromeLinkedList;

import com.ivy.algorithm.linkedList.bean.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        List<Integer> list = new ArrayList<Integer>();
        ListNode point = head;
        while (point != null) {
            list.add(point.val);
            point = point.next;
        }
        int i = 0;
        int j = list.size()-1;
        while (i <= j) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
