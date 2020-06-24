package com.ivy.algorithm.other.UTFEightValidation;

public class SolutionTest {
    public static void main(String[] args) {
        //System.out.println("-------------:"+new Solution().validUtf8(new int[]{145}));
        System.out.println("-------------:"+new Solution().validUtf8(new int[]{250,145,145,145,145}));
        //System.out.println("-------------:"+new Solution().validUtf8(new int[]{197, 130, 1}));
        //System.out.println("-------------:"+new Solution().validUtf8(new int[]{235, 140, 4}));
    }
}
