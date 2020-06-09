package com.ivy.algorithm.DynamicPlanning.BestTimetoBuyandSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int result = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int size = prices.length;
        for (int i = 0; i < size; i++) {
            minValue = Math.min(minValue,prices[i]);
            result = Math.max(result,prices[i]-minValue);
        }
        return result;
    }
}
