package com.ivy.algorithm.sort.KthLargestElementinanArray;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("----------------:"+new Solution().findKthLargest(new int[]{3,2,1,5,6,4},2));
        System.out.println("----------------:"+new Solution().findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
        System.out.println("----------------:"+new Solution().findKthLargest(new int[]{-1,2,0},2));
    }
}
