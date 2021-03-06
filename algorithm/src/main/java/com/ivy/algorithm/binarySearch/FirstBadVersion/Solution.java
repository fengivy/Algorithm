package com.ivy.algorithm.binarySearch.FirstBadVersion;

public class Solution {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start + 1 < end) {
            int middle = start+(end-start)/2;
            if (isBadVersion(middle)){
                end = middle;
            }else{
                start = middle;
            }
        }
        if (isBadVersion(start)) {
            return start;
        }
        if (isBadVersion(end)) {
            return end;
        }
        return -1;
    }

    public boolean isBadVersion(int version){
        return version >= 4;
    }
}
