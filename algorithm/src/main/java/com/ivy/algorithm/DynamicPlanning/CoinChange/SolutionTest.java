package com.ivy.algorithm.DynamicPlanning.CoinChange;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("--------------:"+new Solution().coinChange(new int[]{1, 2, 5},11));
        System.out.println("--------------:"+new Solution().coinChange(new int[]{2},3));
    }
}
