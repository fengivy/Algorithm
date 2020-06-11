package com.ivy.algorithm.tree.KthSmallestElementinaBST;

import com.ivy.algorithm.tree.bean.TreeUtil;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("-------------------:"+new Solution().kthSmallest(TreeUtil.createTreeNode(new Integer[]{3,1,4,null,2}),1));
        System.out.println("-------------------:"+new Solution().kthSmallest(TreeUtil.createTreeNode(new Integer[]{5,3,6,2,4,null,null,1}),3));
    }
}
