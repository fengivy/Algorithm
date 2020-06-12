package com.ivy.algorithm.tree.PopulatingNextRightPointersinEachNode;

import com.ivy.algorithm.tree.bean.Node;

public class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            root.left.next = root.right;
            connectNode(root.left,root.right);
        }
        return root;
    }

    private void connectNode(Node left, Node right) {
        if (left.left == null) {
            return;
        }
        left.left.next = left.right;
        left.right.next = right.left;
        right.left.next = right.right;
        connectNode(left.left,left.right);
        connectNode(left.right,right.left);
        connectNode(right.left,right.right);
    }
}
