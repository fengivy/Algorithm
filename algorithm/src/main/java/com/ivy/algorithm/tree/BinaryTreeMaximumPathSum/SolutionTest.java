package com.ivy.algorithm.tree.BinaryTreeMaximumPathSum;

import com.ivy.algorithm.tree.bean.TreeUtil;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("-----------------:"+new Solution().maxPathSum(TreeUtil.createTreeNode(new Integer[]{1,2,3})));
        System.out.println("-----------------:"+new Solution().maxPathSum(TreeUtil.createTreeNode(new Integer[]{-10,9,20,null,null,15,7})));
    }
}
