package com.ivy.algorithm.sort.FindPeakElement;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("-------------:"+new Solution().findPeakElement(new int[]{3,2,1}));
        System.out.println("-------------:"+new Solution().findPeakElement(new int[]{1,2,3,1}));
        System.out.println("-------------:"+new Solution().findPeakElement(new int[]{1,2,1,3,5,6,4}));
        System.out.println("-------------:"+new Solution().findPeakElement(new int[]{2,1}));
        System.out.println("-------------:"+new Solution().findPeakElement(new int[]{0}));
    }
}
