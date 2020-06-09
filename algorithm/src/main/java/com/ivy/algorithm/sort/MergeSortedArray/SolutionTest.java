package com.ivy.algorithm.sort.MergeSortedArray;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,0,0,0};
        int[] b = new int[]{2,5,6};
        new Solution().merge(a,3,b,3);
        System.out.println("-----------------:"+ Arrays.toString(a));
    }
}
