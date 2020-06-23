package com.ivy.algorithm.linkedList.RotateList;

import com.ivy.algorithm.linkedList.bean.ListNodeUtil;

public class SolutionTest {
    public static void main(String[] args) {
        ListNodeUtil.printListNode(new Solution().rotateRight(ListNodeUtil.createNode(new int[]{1,2,3,4,5}),2));
    }
}
