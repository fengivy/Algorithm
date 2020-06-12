package com.ivy.algorithm.linkedList.IntersectionofTwoLinkedLists;

import com.ivy.algorithm.linkedList.bean.ListNodeUtil;

public class SolutionTest {
    public static void main(String[] args) {
        ListNodeUtil.printListNode(new Solution().getIntersectionNode(ListNodeUtil.createNode(new int[]{4,1,8,4,5}),
                ListNodeUtil.createNode(new int[]{5,0,1,8,4,5})));
    }
}
