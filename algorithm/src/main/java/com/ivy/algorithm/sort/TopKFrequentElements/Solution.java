package com.ivy.algorithm.sort.TopKFrequentElements;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        //计算次数
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }
        int size = hashMap.size();
        int[][] numAndCount = new int[size][2];
        Set<Map.Entry<Integer,Integer>> set = hashMap.entrySet();
        int i = 0;
        for (Map.Entry entry : set) {
            numAndCount[i][0] = (int) entry.getKey();
            numAndCount[i][1] = (int) entry.getValue();
            i++;
        }
        sort(numAndCount);
        int[] result = new int[k];
        for (i = 0; i < k; i++) {
            result[i] =numAndCount[i][0];
        }
        return result;
    }

    private void sort(int[][] numAndCount) {
        int start = 0;
        int end = numAndCount.length-1;
        quickSort(numAndCount, start, end);
    }

    private void quickSort(int[][] numAndCount, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int value = numAndCount[start+(end-start)/2][1];
        while (i <= j) {
            while (i <= j && numAndCount[i][1] > value) {
                i++;
            }

            while (i <= j && numAndCount[j][1] < value) {
                j--;
            }
            if (i <= j) {
                int[] temp = numAndCount[i];
                numAndCount[i] = numAndCount[j];
                numAndCount[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(numAndCount, start, j);
        quickSort(numAndCount,i,end);
    }
}
