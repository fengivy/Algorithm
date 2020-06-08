package com.ivy.algorithm.sort.SumSwapLCCI;

public class Solution {
    public int[] findSwapValues(int[] array1, int[] array2) {
        int[] shortArray = array1.length<array2.length?array1:array2;
        int[] longArray = array1.length>=array2.length?array1:array2;
        int sum1 = sum(shortArray);
        int sum2 = sum(longArray);
        double value = sum1-sum2;
        if (Math.abs(value)%2==1)
            return new int[]{};
        sort(shortArray);
        sort(longArray);
        //二分
        for (int i = 0; i < shortArray.length; i++) {
            int start = 0;
            int end = longArray.length-1;
            while (start + 1 < end) {
                int middle = start+(end-start)/2;
                int difference = (shortArray[i] - longArray[middle]) * 2;
                if (difference == value) {
                    if (shortArray == array1) {
                        return new int[]{shortArray[i],longArray[middle]};
                    }else{
                        return new int[]{longArray[middle],shortArray[i]};
                    }
                } else if (difference < value) {
                    end = middle;
                }else{
                    start = middle;
                }
            }
            if ((shortArray[i] - longArray[start]) * 2 == value) {
                if (shortArray == array1) {
                    return new int[]{shortArray[i],longArray[start]};
                }else{
                    return new int[]{longArray[start],shortArray[i]};
                }
            }
            if ((shortArray[i] - longArray[end]) * 2 == value) {
                if (shortArray == array1) {
                    return new int[]{shortArray[i],longArray[end]};
                }else{
                    return new int[]{longArray[end],shortArray[i]};
                }
            }
        }
        /*int lastJ = 0; //寻找是否有值
        for (int i = 0; i < array1.length; i++) {
            for (int j = lastJ; j < array2.length; j++) {
                int difference = (array1[i] - array2[j])* isOneLess * 2;
                if (difference == value) {
                    return new int[]{array1[i],array2[j]};
                }else if(difference<value){
                    if (array2[j]>=array1[i]){
                        continue;
                    }else{
                        lastJ = j;
                        break;
                    }
                }else{
                    if (array2[j]>=array1[i]){
                        lastJ = j;
                        break;
                    }else{
                        continue;
                    }
                }
            }
        }*/
        return new int[]{};
    }

    private int sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    private void sort(int[] array) {
        int start = 0;
        int end = array.length-1;
        quickSort(array,start,end);
    }


    private void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int i=start;
        int j = end;
        int value = array[start+(end-start)/2];
        while (i <= j) {
            while (i <= j && array[i] < value) {
                i++;
            }
            while (i <= j && array[j] > value) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        quickSort(array, start, j);
        quickSort(array,i,end);
    }
}
