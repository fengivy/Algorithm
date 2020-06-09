package com.ivy.algorithm.tree.ConvertSortedArraytoBinarySearchTree;

import com.ivy.algorithm.tree.bean.TreeNode;

public class SolutionTest {
    public static void main(String[] args) {
        TreeNode node = new Solution().sortedArrayToBST(new int[]{-10,-3,0,5,9});
        System.out.println("--------------:"+node);
    }
}
