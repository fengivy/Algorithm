package com.ivy.algorithm.linkedList.AddTwoNumbers;

import com.ivy.algorithm.linkedList.bean.ListNodeUtil;

public class SolutionTest {
    public static void main(String[] args) {
        ListNodeUtil.printListNode(new Solution().addTwoNumbers(ListNodeUtil.createNode(new int[]{2,4,5,1}),
                ListNodeUtil.createNode(new int[]{5,6,4})));
    }
}
