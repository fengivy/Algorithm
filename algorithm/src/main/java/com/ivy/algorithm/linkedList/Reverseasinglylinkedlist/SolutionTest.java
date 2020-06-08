package com.ivy.algorithm.linkedList.Reverseasinglylinkedlist;

import com.ivy.algorithm.linkedList.bean.ListNode;
import com.ivy.algorithm.linkedList.bean.ListNodeUtil;

public class SolutionTest {
    public static void main(String[] args) {
        ListNode node = ListNodeUtil.createNode(new int[]{1,2,3,4,5});
        ListNodeUtil.printListNode(node);
        ListNodeUtil.printListNode(new Solution().reverseList(node));
    }
}
