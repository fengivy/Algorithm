package com.ivy.algorithm.linkedList.MergeTwoSortedLists;

import com.ivy.algorithm.linkedList.bean.ListNode;
import com.ivy.algorithm.linkedList.bean.ListNodeUtil;

public class SolutionTest {
    public static void main(String[] args) {
        ListNode a = ListNodeUtil.createNode(new int[]{1,2,4});
        ListNode b = ListNodeUtil.createNode(new int[]{1,3,4});
        ListNodeUtil.printListNode(new Solution().mergeTwoLists(a,b));
    }
}
