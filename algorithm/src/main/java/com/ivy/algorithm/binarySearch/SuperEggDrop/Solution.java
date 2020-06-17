package com.ivy.algorithm.binarySearch.SuperEggDrop;

public class Solution {
    public int superEggDrop(int K, int N) {
        return getCount(0,N);
    }

    private int getCount(int start, int end) {
        if (start >= end - 1) {
            return 1;
        }
        int middle = start+(end-start)/2;
        return Math.min(getCount(start,middle-1),getCount(middle+1,end))+1;
    }
}
