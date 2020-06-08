package com.ivy.algorithm.linkedList.DeleteLinkedListNode;

import com.ivy.algorithm.linkedList.bean.ListNode;
import com.ivy.algorithm.linkedList.bean.ListNodeUtil;

public class SolutionTest {
    public static void main(String[] args) {
        ListNode node = ListNodeUtil.createNode(new int[]{4,1,5,9});
        ListNodeUtil.printListNode(node);
        new Solution().deleteNode(node,5);
        ListNodeUtil.printListNode(node);
    }
}
