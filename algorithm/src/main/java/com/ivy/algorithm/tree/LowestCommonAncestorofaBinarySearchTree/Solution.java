package com.ivy.algorithm.tree.LowestCommonAncestorofaBinarySearchTree;

import com.ivy.algorithm.tree.bean.TreeNode;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val ||root.val == q.val) {
            return root;
        }
        if (p.val < root.val&&q.val>root.val) {
            return root;
        }else if(p.val>root.val && q.val<root.val){
            return root;
        }else if(p.val<root.val && q.val<root.val){
             return lowestCommonAncestor(root.left,p,q);
        } else {
             return lowestCommonAncestor(root.right,p,q);
        }
    }
}
