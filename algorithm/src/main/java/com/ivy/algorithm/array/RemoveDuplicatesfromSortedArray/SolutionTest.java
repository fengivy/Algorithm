package com.ivy.algorithm.array.RemoveDuplicatesfromSortedArray;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 2};
        System.out.println("----------------"+new Solution().removeDuplicates(a));
        System.out.println("----------------"+ Arrays.toString(a));
        int[] b = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println("----------------"+new Solution().removeDuplicates(b));
        System.out.println("----------------"+ Arrays.toString(b));
    }
}
