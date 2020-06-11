package com.ivy.algorithm.tree.KthSmallestElementinaBST;

import com.ivy.algorithm.tree.bean.TreeNode;

import java.util.Stack;

public class Solution {
    class Result{
        public int value;
        public int count;

        public Result(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        Result result = new Result(-1,k);
        traversal(stack,result);
        return result.value;
    }

    private void traversal(Stack<TreeNode> stack,Result result) {
        if (result.count == 0) {
            return;
        }
        TreeNode treeNode = stack.peek();
        if (treeNode.left != null) {
            stack.add(treeNode.left);
            traversal(stack,result);
        }
        TreeNode top = stack.pop();
        result.count--;
        if (result.count == 0) {
            result.value = top.val;
        }
        if (treeNode.right != null) {
            stack.add(treeNode.right);
            traversal(stack,result);
        }
    }


}
