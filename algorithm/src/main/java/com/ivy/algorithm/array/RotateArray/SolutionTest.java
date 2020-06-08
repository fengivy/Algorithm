package com.ivy.algorithm.array.RotateArray;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7};
        new Solution().rotate(a,3);
        System.out.println("-------------:"+ Arrays.toString(a));
        int[] b = new int[]{-1,-100,3,99};
        new Solution().rotate(b,3);
        System.out.println("-------------:"+ Arrays.toString(b));
    }
}
