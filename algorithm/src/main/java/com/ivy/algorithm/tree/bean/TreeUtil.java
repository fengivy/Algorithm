package com.ivy.algorithm.tree.bean;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeUtil {
    public static TreeNode createTreeNode(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode treeNode = new TreeNode(arr[0]);
        queue.add(treeNode);
        int i = 1;
        int size = arr.length-1;
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            if (i > size) {
                break;
            }
            if (arr[i] != null) {
                TreeNode left = new TreeNode(arr[i]);
                node.left = left;
                queue.add(left);
            }
            i++;
            if (i > size) {
                break;
            }
            if (arr[i] != null) {
                TreeNode right = new TreeNode(arr[i]);
                node.right = right;
                queue.add(right);
            }
            i++;
        }
        return treeNode;
    }

    public static void printTreeNode(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            list.add(node);
            if (node!=null) {
                queue.add(node.left);
                queue.add(node.right);
            }
        }
    }
}
