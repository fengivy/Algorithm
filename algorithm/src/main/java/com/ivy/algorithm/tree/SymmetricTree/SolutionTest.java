package com.ivy.algorithm.tree.SymmetricTree;

import com.ivy.algorithm.tree.bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SolutionTest {
    public static void main(String[] args) {
        Queue<TreeNode> stack = new LinkedList<>();
        stack.add(null);
        System.out.println("-------1:"+stack.remove());
    }
}
