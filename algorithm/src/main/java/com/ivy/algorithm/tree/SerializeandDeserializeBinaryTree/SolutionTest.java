package com.ivy.algorithm.tree.SerializeandDeserializeBinaryTree;

import com.ivy.algorithm.tree.bean.TreeNode;

public class SolutionTest {
    public static void main(String[] args) {
        String a = "[1,2,3,null,null,4,5]";
        TreeNode node = new Codec().deserialize(a);
        System.out.println("-----:"+new Codec().serialize(node));
    }
}
