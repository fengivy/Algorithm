package com.ivy.algorithm.sort.MergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result  =new ArrayList<>();
        if (intervals == null||intervals.length == 0) {
            return new int[0][0];
        }
        sort(intervals);
        for (int i = 0; i < intervals.length; i++) {
            int size = result.size();
            if (size > 0) {
                int[] last= result.get(result.size()-1);
                if (intervals[i][0]<=last[1]){
                    last[1] = Math.max(intervals[i][1],last[1]);
                }else{
                    result.add(intervals[i]);
                }
            }else{
                result.add(intervals[i]);
            }
        }
        int[][] value = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            value[i]  = result.get(i);
        }
        return value;
    }

    private void sort(int[][] intervals) {
        int start = 0;
        int end = intervals.length-1;
        quickSort(intervals,start,end);
    }

    private void quickSort(int[][] intervals, int start, int end) {
        if (start>=end){
            return;
        }
        int i = start;
        int j = end;
        int value = intervals[start+(end-start)/2][0];
        while (i <= j) {
            while (i <= j && intervals[i][0] < value) {
                i++;
            }

            while (i <= j && intervals[j][0] > value) {
                j--;
            }

            if (i <= j) {
                int[] temp = intervals[i];
                intervals[i] = intervals[j];
                intervals[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(intervals, start, j);
        quickSort(intervals,i,end);
    }
}
