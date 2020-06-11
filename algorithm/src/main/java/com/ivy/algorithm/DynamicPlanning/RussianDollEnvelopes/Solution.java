package com.ivy.algorithm.DynamicPlanning.RussianDollEnvelopes;


public class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0) {
            return 0;
        }
        sortArray(envelopes); //排序，把w从小到大排序
        int size = envelopes.length;
        int[] f = new int[size+1];
        f[0] = 0;
        f[1] = 1;
        int maxResult = 1;
        for (int i = 2; i <= size; i++) {
            f[i] = 1;
            for(int j=1;j<i;j++){
                if (envelopes[i-1][0]>envelopes[j-1][0] && envelopes[i-1][1]>envelopes[j-1][1]){
                    f[i] = Math.max(f[j]+1,f[i]);
                }
            }
            maxResult = Math.max(maxResult,f[i]);
        }
        return maxResult;
    }

    private void sortArray(int[][] envelopes) {
        int start = 0;
        int end = envelopes.length-1;
        quickSort(envelopes,start,end);
    }

    private void quickSort(int[][] envelopes, int start, int end) {
        if (start >= end) {
            return;
        }
        int i= start;
        int j = end;
        int value = envelopes[start+(end-start)/2][0];
        while (i <= j) {
            while (i <= j && envelopes[i][0] < value) {
                i++;
            }

            while (i <= j && envelopes[j][0] > value) {
                j--;
            }

            if (i <= j) {
                int[] temp = envelopes[j];
                envelopes[j]  = envelopes[i];
                envelopes[i]  = temp;
                i++;
                j--;
            }
        }
        quickSort(envelopes,start,j);
        quickSort(envelopes,i,end);
    }
}
