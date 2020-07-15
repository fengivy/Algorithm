package com.ivy.algorithm.swordOffer.isSymmetric;

import com.ivy.algorithm.tree.bean.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return judgeIsSymmetric(root,root);
    }

    private boolean judgeIsSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        }else{
            if (left.val != right.val) {
                return false;
            }
            return judgeIsSymmetric(left.left,right.right) && judgeIsSymmetric(left.right,right.left);
        }
    }
}
