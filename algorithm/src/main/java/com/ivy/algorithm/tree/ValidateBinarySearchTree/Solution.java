package com.ivy.algorithm.tree.ValidateBinarySearchTree;

import com.ivy.algorithm.tree.bean.TreeNode;

import jdk.nashorn.internal.ir.IfNode;


public class Solution {
    class Pair{
        public Integer minValue;
        public Integer maxValue;
        public boolean isValid;
        public Pair(Integer minValue,Integer maxValue, boolean isValid) {
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.isValid = isValid;
        }
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        Pair value =  judgeIsValidBST(root);
        return value.isValid;
    }

    private  Pair judgeIsValidBST(TreeNode root) {
        if (root == null) {
            return new Pair(null,null,true);
        }
        Pair left = judgeIsValidBST(root.left);
        Pair right = judgeIsValidBST(root.right);
        if (!left.isValid || !right.isValid) {
            return new Pair(null,null,false);
        }
        if ((left.maxValue == null || root.val>left.maxValue)&&(right.minValue == null ||root.val<right.minValue)){
            return new Pair(left.minValue==null?root.val:left.minValue,right.maxValue==null?root.val:right.maxValue,true);
        }else{
            return new Pair(null,null,false);
        }
    }
}
