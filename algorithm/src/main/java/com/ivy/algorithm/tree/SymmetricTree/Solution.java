package com.ivy.algorithm.tree.SymmetricTree;

import com.ivy.algorithm.tree.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> list = new LinkedList<>();
        list.add(root.left);
        list.add(root.right);
        return isSymmetric(list);
    }

    private boolean isSymmetric(Queue<TreeNode> list) {
        int size = list.size();
        boolean isFinish = true; //判断是否最后一层
        Stack<TreeNode> stack = new Stack<>();
        for (int i = 0; i < size/2; i++) {
            TreeNode node = list.remove();
            if (node == null) {
                list.add(null);
                list.add(null);
            }else{
                if (node.left != null) {
                    isFinish = false;
                }
                list.add(node.left);
                if (node.right != null) {
                    isFinish = false;
                }
                list.add(node.right);
            }
            stack.push(node);
        }
        for (int i = size / 2; i < size; i++) {
            TreeNode node = list.remove();
            if (node == null) {
                list.add(null);
                list.add(null);
            }else{
                if (node.left != null) {
                    isFinish = false;
                }
                list.add(node.left);
                if (node.right != null) {
                    isFinish = false;
                }
                list.add(node.right);
            }
            TreeNode top = stack.peek();
            if ((top==null&&node == null) ||((top!=null&&node!=null)&&top.val == node.val)){
                stack.pop();
            }else{
                return false;
            }
        }
        if (isFinish) {
            return true;
        }
        return isSymmetric(list);
    }
}
