package com.ivy.algorithm.array.FourSumII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //todo 超时，需要修改
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        List<int[]> list = new ArrayList<>();
        list.add(A);
        list.add(B);
        list.add(C);
        list.add(D);
        return search(list,0,0);
    }

    private int search(List<int[]> list, int index,int currentValue) {
        if (index == list.size()) {
            return currentValue == 0?1:0;
        }
        int[] value = list.get(index);
        int result = 0;
        for (int item : value) {
            currentValue += item;
            result += search(list, index + 1, currentValue);
            currentValue -= item;
        }
        return result;
    }
}
