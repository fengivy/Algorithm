package com.ivy.algorithm.binarySearch.FindFirstandLastPositionofElementinSortedArray;


import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("-----------------:"+ Arrays.toString(new Solution().searchRange(new int[]{1,2,3,3,3,3,4,5,9}, 3)));
        System.out.println("-----------------:"+ Arrays.toString(new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println("-----------------:"+ Arrays.toString(new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
    }
}
