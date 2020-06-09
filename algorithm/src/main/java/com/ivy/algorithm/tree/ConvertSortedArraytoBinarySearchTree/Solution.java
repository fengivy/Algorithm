package com.ivy.algorithm.tree.ConvertSortedArraytoBinarySearchTree;

import com.ivy.algorithm.tree.bean.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return createBST(nums,0,nums.length-1);
    }

    private TreeNode createBST(int[] nums, int start, int end) {
        if (start == end){
            return new TreeNode(nums[start]);
        } else if (start > end) {
            return null;
        }
        int middle = start+(end-start)/2;
        TreeNode node =new TreeNode(nums[middle]);
        node.left = createBST(nums,start,middle-1);
        node.right = createBST(nums,middle+1,end);
        return node;
    }
}
