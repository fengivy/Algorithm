package com.ivy.algorithm.swordOffer.mirrorTree;

import com.ivy.algorithm.tree.bean.TreeNode;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        mirror(root);
        return root;
    }

    private void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
