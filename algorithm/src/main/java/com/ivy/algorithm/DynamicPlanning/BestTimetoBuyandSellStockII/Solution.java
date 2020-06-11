package com.ivy.algorithm.DynamicPlanning.BestTimetoBuyandSellStockII;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int result = 0;
        int n = prices.length;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            if (prices[i] > min) {
                result += (prices[i] - min);
            }
            min = prices[i];
        }
        return result;
    }
}
