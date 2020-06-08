package com.ivy.algorithm.binarySearch.SearchRotateArrayLCCI;

public class Solution {
    public int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start + 1 < end) {
            int middle = start+(end-start)/2;
            if (arr[middle] > arr[end]) {
                if (arr[middle] >= target && arr[start] <= target) {
                    end = middle;
                }else{
                    start = middle;
                }
            }else if(arr[middle] < arr[end]){
                if (arr[middle] < target && target <= arr[end]) {
                    if (arr[end] == arr[start] && arr[end] == target) {
                        return start;
                    }
                    start = middle;
                }else{
                    end = middle;
                }
            }else{
                end--;
            }
        }
        if (arr[start] == target) {
            return start;
        }
        if (arr[end] == target) {
            return end;
        }
        return -1;
    }
}
