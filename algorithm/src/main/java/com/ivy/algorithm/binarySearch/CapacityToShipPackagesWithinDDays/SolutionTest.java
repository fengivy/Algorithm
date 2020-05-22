package com.ivy.algorithm.binarySearch.CapacityToShipPackagesWithinDDays;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("-------------:"+new Solution().shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10},5));
        System.out.println("-------------:"+new Solution().shipWithinDays(new int[]{3,2,2,4,1,4},3));
        System.out.println("-------------:"+new Solution().shipWithinDays(new int[]{1,2,3,1,1},4));
    }
}
