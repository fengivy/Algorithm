package com.ivy.algorithm.linkedList.MergekSortedLists;

import com.ivy.algorithm.linkedList.bean.ListNode;
import com.ivy.algorithm.linkedList.bean.ListNodeUtil;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    public static void main(String[] args) {
        List<ListNode> list = new ArrayList<>();
        /*list.add(ListNodeUtil.createNode(new int[]{1,4,5}));
        list.add(ListNodeUtil.createNode(new int[]{2,6}));
        list.add(ListNodeUtil.createNode(new int[]{1,3,4}));*/
        list.add(ListNodeUtil.createNode(new int[]{-8,-7,-6,-3,-2,-2,0,3}));
        list.add(ListNodeUtil.createNode(new int[]{-10,-6,-4,-4,-4,-2,-1,4}));
        list.add(ListNodeUtil.createNode(new int[]{-10,-9,-8,-8,-6}));
        list.add(ListNodeUtil.createNode(new int[]{-10,0,4}));
        ListNode[] nodes = new ListNode[list.size()];
        list.toArray(nodes);
        ListNodeUtil.printListNode(new Solution().mergeKLists(nodes));
    }
}
