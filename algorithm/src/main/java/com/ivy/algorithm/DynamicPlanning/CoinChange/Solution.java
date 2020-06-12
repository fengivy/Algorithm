package com.ivy.algorithm.DynamicPlanning.CoinChange;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        if (coins == null || coins.length == 0) {
            return -1;
        }
        int[] f = new int[amount+1];
        f[0] = 0;
        for (int i = 1; i <= amount; i++) {
            f[i] = -1;
            for (int j = 0; j < coins.length; j++) {
                if(i-coins[j]>=0&&f[i-coins[j]]>-1){ //判断当前币种是否有效
                    if (f[i] == -1){
                        f[i] = f[i-coins[j]] + 1;
                    }else{
                        f[i] = Math.min(f[i],f[i-coins[j]]+1);
                    }
                }
            }
        }
        return f[amount];
    }
}
