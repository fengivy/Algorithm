package com.ivy.algorithm.tree.BinaryTreeMaximumPathSum;

import com.ivy.algorithm.tree.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Solution {
    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //使用动态规划，自底向上计算最大路径
        int maxResult = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) { //把树从上往下，一层一层的压入栈中
            TreeNode node = queue.remove();
            stack.add(node);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        while (!stack.isEmpty()){
            TreeNode node  = stack.pop();
            int left = node.left == null?0:node.left.val;
            int right = node.right == null?0:node.right.val;
            int max = Math.max(node.val,Math.max(node.val+left,node.val+right));
            maxResult = Math.max(maxResult,Math.max(node.val+left+right,max));
            node.val = max;
        }
        return maxResult;
    }
}
