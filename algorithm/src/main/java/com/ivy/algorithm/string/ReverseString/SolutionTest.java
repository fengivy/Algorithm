package com.ivy.algorithm.string.ReverseString;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        char[] a = new char[]{'h','e','l','l','o'};
        new Solution().reverseString(a);
        System.out.println("--------------:"+ Arrays.toString(a));
    }
}
