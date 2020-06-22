package com.ivy.algorithm.dataStruct.FindMedianfromDataStream;

import java.util.ArrayList;
import java.util.List;

public class MedianFinder {
    private List<Integer> list;
    /** initialize your data structure here. */
    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        if (list.size() == 0) {
            list.add(num);
        }else{
            binaryInsert(num);
        }
    }

    private void binaryInsert(int num) {
        int start = 0;
        int end = list.size()-1;
        while (start + 1 < end) {
            int middle = start+(end-start)/2;
            if (list.get(middle) == num) {
                list.add(middle,num);
                return;
            } else if (list.get(middle) < num) {
                start = middle;
            }else{
                end = middle;
            }
        }
        if (num>=list.get(end)){
            if (end == list.size()-1) {
                list.add(num);
            }else{
                list.add(end+1,num);
            }
        }else if(num<=list.get(start)){
            list.add(start,num);
        }else{
            list.add(end,num);
        }
    }

    public double findMedian() {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() % 2 == 0) {
            return (list.get(list.size()/2)+list.get(list.size()/2-1))/2.0;
        }else{
            return list.get(list.size()/2);
        }
    }
}
