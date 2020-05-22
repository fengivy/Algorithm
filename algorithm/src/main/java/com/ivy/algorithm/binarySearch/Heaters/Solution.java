package com.ivy.algorithm.binarySearch.Heaters;

import java.util.Arrays;

public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses); //房子，heater排序
        Arrays.sort(heaters);
        int minRadius = 0;
        for (int house : houses) { //查找每个房子左右最近的heater
            int start = 0;
            int end = heaters.length - 1;
            while (start + 1 < end) {
                int middle = start + (end - start) / 2;
                if (heaters[middle] == house) {
                    start = middle;
                    end = middle;
                } else if (heaters[middle] < house) {
                    start = middle;
                } else {
                    end = middle;
                }
            }
            if (house <= heaters[start]) {
                minRadius = Math.max(heaters[start] - house, minRadius);
            } else if (house >= heaters[end]) {
                minRadius = Math.max(house - heaters[end], minRadius);
            } else {
                minRadius = Math.max(minRadius, Math.min(house - heaters[start], heaters[end] - house));
            }
        }
        return minRadius;
    }

}
