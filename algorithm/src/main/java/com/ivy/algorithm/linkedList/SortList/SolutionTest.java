package com.ivy.algorithm.linkedList.SortList;

import com.ivy.algorithm.linkedList.bean.ListNodeUtil;

public class SolutionTest {
    public static void main(String[] args) {
        ListNodeUtil.printListNode(new Solution().sortList(ListNodeUtil.createNode(new int[]{4,2,1,3})));
    }
}
