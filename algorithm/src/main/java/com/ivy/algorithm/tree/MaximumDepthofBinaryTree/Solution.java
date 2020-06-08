package com.ivy.algorithm.tree.MaximumDepthofBinaryTree;

import com.ivy.algorithm.tree.bean.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getMaxDepth(root);
    }

    private int getMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getMaxDepth(root.left);
        int right = getMaxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
