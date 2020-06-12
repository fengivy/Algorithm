package com.ivy.algorithm.tree.BinaryTreeZigzagLevelOrderTraversal;

import com.ivy.algorithm.tree.bean.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isLTR = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            Integer[] arr = new Integer[size];
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                arr[isLTR?i:(size-1-i)] = node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            isLTR = !isLTR;
            result.add(Arrays.asList(arr));
        }
        return result;
    }
}
