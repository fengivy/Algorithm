package com.ivy.algorithm.tree.ConstructBinaryTreefromPreorderandInorderTraversal;

import com.ivy.algorithm.tree.bean.TreeNode;


public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        return generateTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }

    private TreeNode generateTree(int[] preorder, int[] inorder,int startPre,int endPre,int startIn,int endIn) {
        TreeNode node = new TreeNode(preorder[startPre]);
        int num = 0;
        for (int i = startIn; i < endIn; i++) { //找到在中序之前有多少个
            if (node.val == inorder[i]){
                break;
            }else{
                num++;
            }
        }
        if (num > 0) {
            node.left = generateTree(preorder,inorder,startPre+1,startPre+num,startIn,(startIn+num-1));
        }
        if(num < (endIn-startIn))
            node.right = generateTree(preorder,inorder,startPre+num+1,endPre,startIn+num+1,endIn);
        return node;

    }
}
