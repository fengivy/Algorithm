package com.ivy.algorithm.DynamicPlanning.Triangle;

import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        int minValue = Integer.MAX_VALUE;
        int size = triangle.size();
        for (int i = 1; i < size; i++) {
            List<Integer> preFloor = triangle.get(i-1);
            List<Integer> floor = triangle.get(i);
            int num = floor.size();
            for (int j = 0; j < num; j++) {
                int value = Integer.MAX_VALUE;
                if (j < preFloor.size()) {
                    value = preFloor.get(j);
                }
                if (j-1>=0&&(j-1)<preFloor.size()){
                    value = Math.min(value,preFloor.get(j-1));
                }
                floor.set(j,floor.get(j)+value);
                if (i == size-1)
                    minValue = Math.min(minValue,floor.get(j));
            }
        }
        return minValue;
    }
}
