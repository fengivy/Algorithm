package com.ivy.algorithm.tree.PopulatingNextRightPointersinEachNode;

import com.ivy.algorithm.tree.bean.TreeUtil;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("--------------:"+ new Solution().connect(TreeUtil.createNode(new Integer[]{1,2,3,4,5,6,7})));
    }
}
