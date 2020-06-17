package com.ivy.algorithm.array.IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length ==0 ||nums2.length ==0) {
            return new int[]{};
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        if (list.isEmpty()) {
            return new int[]{};
        } else{
            int[] result = new int[list.size()];
            for (int k = 0; k < list.size(); k++) {
                result[k] = list.get(k);
            }
            return result;
        }
    }
}
