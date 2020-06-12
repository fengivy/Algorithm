package com.ivy.algorithm.tree.BinaryTreeInorderTraversal;

import com.ivy.algorithm.tree.bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        traversal(result,root);
        return result;
    }

    private void traversal(List<Integer> result,TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            traversal(result,root.left);
        }
        result.add(root.val);
        if (root.right != null) {
            traversal(result,root.right);
        }
    }
}
