package com.ivy.algorithm.string.SimplifyPath;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("------------:"+new Solution().simplifyPath("/33///3///6//7/8//9"));
        System.out.println("------------:"+new Solution().simplifyPath("/../"));
        System.out.println("------------:"+new Solution().simplifyPath("/home//foo/"));
        System.out.println("------------:"+new Solution().simplifyPath("/a/./b/../../c/"));
        System.out.println("------------:"+new Solution().simplifyPath("/a/../../b/../c//.//"));
        System.out.println("------------:"+new Solution().simplifyPath("/a//b////c/d//././/.."));
    }
}
