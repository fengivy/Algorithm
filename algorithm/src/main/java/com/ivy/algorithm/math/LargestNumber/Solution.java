package com.ivy.algorithm.math.LargestNumber;

public class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        int size = nums.length;
        sortByFirstNum(nums);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (nums[i] ==0 && sb.length() == 0 && i != size - 1) {
                continue;
            }
            sb.append(nums[i]);
        }
        return sb.toString();
    }

    private void sortByFirstNum(int[] f) {
        int start = 0;
        int end = f.length-1;
        quickSort(f, start, end);
    }

    private void quickSort(int[] f, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int value = f[start+(end-start)/2];
        while (i <= j) {
            while (i <= j && compareNum(f[i],value)>0) {
                i++;
            }
            while (i <= j && compareNum(f[j] ,value)<0) {
                j--;
            }
            if (i <= j) {
                int temp = f[i];
                f[i] = f[j];
                f[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(f, start, j);
        quickSort(f,i,end);
    }

    private int compareNum(int one, int two) {
        if (one == two) {
            return 0;
        }else{
            String a= one+""+two;
            String b= two+""+one;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i)>b.charAt(i)){
                    return 1;
                }
                if(a.charAt(i)<b.charAt(i)){
                    return -1;
                }
            }
        }
        return 0;
    }
}
