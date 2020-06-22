package com.ivy.algorithm.dataStruct.FindMedianfromDataStream;

public class SolutionTest {
    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
        obj.addNum(3);
        obj.addNum(2);
        System.out.println("-----------:"+obj.findMedian());
        obj.addNum(1);
        System.out.println("-----------:"+obj.findMedian());
    }
}
