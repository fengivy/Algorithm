package com.ivy.algorithm.binarySearch.SearchInsertPosition;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("-----------"+new Solution().searchInsert(new int[]{1,3,5,6},5));
        System.out.println("-----------"+new Solution().searchInsert(new int[]{1,3,5,6},2));
        System.out.println("-----------"+new Solution().searchInsert(new int[]{1,3,5,6},7));
        System.out.println("-----------"+new Solution().searchInsert(new int[]{1,3,5,6},0));
    }
}
