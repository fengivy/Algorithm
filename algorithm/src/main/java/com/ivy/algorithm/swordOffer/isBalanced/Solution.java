package com.ivy.algorithm.swordOffer.isBalanced;

import com.ivy.algorithm.tree.bean.TreeNode;

public class Solution {
    private class Value{
        public int num;
        public boolean isTree;

        public Value(int num, boolean isTree) {
            this.num = num;
            this.isTree = isTree;
        }
    }
    public boolean isBalanced(TreeNode root) {
        Value value = getNum(root);
        return value.isTree;
    }

    private Value getNum(TreeNode root){
        if (root == null) {
            return new Value(0,true);
        }
        Value left = getNum(root.left);
        Value right = getNum(root.right);
        if (left.isTree && right.isTree && Math.abs(left.num - right.num)<=1) {
            return new Value(Math.max(left.num,right.num)+1,true);
        }
        return new Value(0,false);
    }
}
