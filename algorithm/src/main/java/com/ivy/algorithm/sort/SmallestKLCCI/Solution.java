package com.ivy.algorithm.sort.SmallestKLCCI;

import java.util.Arrays;

public class Solution {
    public int[] smallestK(int[] arr, int k) {
        if (k == 0) {
            return new int[]{};
        }
        int start = 0;
        int end = arr.length -1;
        getSmallestK(arr,start,end,k-1);
        return Arrays.copyOf(arr,k);
    }

    private void getSmallestK(int[] arr, int start, int end,int k) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int middle = arr[start+(end-start)/2];
        while (i <= j) {
            while (i<=j && arr[i]<middle){
                i++;
            }

            while (i<=j && arr[j]>middle){
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (k<=j){
            getSmallestK(arr,start,j,k);
        }else{
            getSmallestK(arr,start,j,k);
            getSmallestK(arr,i,end,k);
        }
    }
}
