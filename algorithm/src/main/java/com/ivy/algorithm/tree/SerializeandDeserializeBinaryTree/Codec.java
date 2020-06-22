package com.ivy.algorithm.tree.SerializeandDeserializeBinaryTree;

import com.ivy.algorithm.tree.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isAllNull = true;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if (node == null) {
                    sb.append("null");
                    sb.append(",");
                    continue;
                }else{
                    sb.append(node.val);
                    sb.append(",");
                }
                if (node.left != null || node.right != null) {
                    isAllNull = false;
                }
                queue.add(node.left);
                queue.add(node.right);
            }
            if (isAllNull) { //全空，游戏结束
                break;
            }
        }
        if (sb.charAt(sb.length()-1) ==','){
            sb.deleteCharAt(sb.length()-1);
        }
        sb.insert(0,"[");
        sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() <= 2) {
            return null;
        }
        data =data.substring(1,data.length()-1);
        String[] items = data.split(",");
        int size = items.length;
        if (items[0].equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(items[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty()){
            TreeNode parent = queue.remove();
            if (i < size) {
                if (!items[i].equals("null")){
                    TreeNode left = new TreeNode(Integer.parseInt(items[i]));
                    parent.left = left;
                    queue.add(left);
                }
            }
            i++;
            if (i < size) {
                if (!items[i].equals("null")){
                    TreeNode right = new TreeNode(Integer.parseInt(items[i]));
                    parent.right = right;
                    queue.add(right);
                }
            }
            i++;
        }
        return root;
    }
}
