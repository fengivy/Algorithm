package com.ivy.algorithm.binarySearch.CapacityToShipPackagesWithinDDays;

public class Solution {
    public int shipWithinDays(int[] weights, int D) {
        if (weights == null) {
            return 0;
        }
        int totalWeight = 0;
        int max = 0;
        for (int weight : weights) {
            totalWeight += weight;
            max = Math.max(max, weight);
        }
        int minWeight = Math.max(totalWeight/D,max); //计算船最小的容量，要么是每天的平均值，要么是货物的最大值
        int maxWeight = totalWeight;//最大的容量
        while (minWeight + 1 < maxWeight) {
            int middleWeight = minWeight +(maxWeight-minWeight)/2;
            if (judgeCanDeal(weights,D,middleWeight)) {
                maxWeight = middleWeight;
            }else{
                minWeight = middleWeight;
            }
        }
        if (judgeCanDeal(weights, D, minWeight)) {
            return minWeight;
        }
        return maxWeight;
    }

    private boolean judgeCanDeal(int[] weights,int D,int currentWeight){
        int day = 1;
        int weight = currentWeight;
        for (int value : weights) {
            if (weight >= value) {
                weight -= value;
            } else {
                weight = currentWeight - value;
                day++;
                if (day > D) { //超时了
                    return false;
                }
            }
        }
        return day <= D;
    }
}
