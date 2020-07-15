package com.ivy.algorithm.swordOffer.MedianFinder;
import java.util.ArrayList;
import java.util.List;

public class MedianFinder {
    private List<Integer> nums = new ArrayList<>();
    public MedianFinder() {

    }

    public void addNum(int num) {
        if (nums.size() == 0) {
            nums.add(num);
        }else{
            int index = findIndex(0,nums.size()-1,num);
            nums.add(index,num);
        }
    }

    private int findIndex(int begin, int end,int num) {
        while (begin + 1 < end) {
            int middle = begin+(end-begin)/2;
            if (nums.get(middle) == num) {
                return middle;
            } else if (nums.get(middle) < num) {
                begin = middle;
            }else{
                end = middle;
            }
        }
        if (nums.get(begin) >= num) {
            return begin;
        } else if (nums.get(end) >= num) {
            return end;
        }else{
            return end+1;
        }
    }

    public double findMedian() {
        if (nums.size() == 0) {
            return 0;
        }
        if (nums.size() % 2 == 0) {
            return (nums.get(nums.size()/2)+nums.get(nums.size()/2-1))/2.0;
        }else{
            return nums.get(nums.size()/2);
        }
    }
}
