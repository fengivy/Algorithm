package com.ivy.algorithm.math.LargestNumber;

public class Solution {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        int size = nums.length;
        //0是在nums的位置，1是首位数字
        int[][] f = new int[size][2];
        findFirstNum(f,nums);
        sortByFirstNum(f);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(nums[f[i][0]]);
        }
        return sb.toString();
    }

    private void sortByFirstNum(int[][] f) {
        int start = 0;
        int end = f.length-1;
        quickSort(f, start, end);
    }

    private void quickSort(int[][] f, int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int value = f[start+(end-start)/2][1];
        while (i <= j) {
            while (i <= j && f[i][1] > value) {
                i++;
            }
            while (i <= j && f[j][1] < value) {
                j--;
            }
            if (i <= j) {
                int[] temp = f[i];
                f[i] = f[j];
                f[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(f, start, j);
        quickSort(f,i,end);
    }

    private void findFirstNum(int[][] f, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            f[i][0] = i;
            int firstNum = nums[i];
            while (firstNum >= 10) {
                firstNum/=10;
            }
            f[i][1] = firstNum;
        }
    }
}
