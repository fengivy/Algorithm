package com.ivy.algorithm.array.MedianofTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) {
            return 0;
        }
        int sizeOne = nums1==null?0:nums1.length;
        int sizeTwo = nums2==null?0:nums2.length;
        if ((sizeOne + sizeTwo) % 2 == 0) {
            return (findMedian((sizeOne+sizeTwo)/2,nums1,nums2)+findMedian((sizeOne+sizeTwo)/2+1,nums1,nums2))/2.0;
        }else{
            return findMedian((sizeOne+sizeTwo)/2+1,nums1,nums2);
        }
    }

    private int findMedian(int k, int[] nums1, int[] nums2) {
        if (nums1 == null) {
            return nums2[k-1];
        }else if(nums2 == null){
            return nums1[k-1];
        }else{
            return findMedian(k,nums1,0,nums1.length-1,nums2,0,nums2.length-1);
        }
    }

    private int findMedian(int k, int[] nums1, int startOne, int endOne, int[] nums2, int startTwo, int endTwo) {
        if (startOne > endOne) {
            return nums2[startTwo+k-1];
        } else if (startTwo > endTwo) {
            return nums1[startOne+k-1];
        }
        if (k == 1) {
            return Math.min(nums1[startOne],nums2[startTwo]);
        }
        int divide = k/2;
        int oneMiddle = endOne-startOne+1>=divide?startOne+(divide-1):endOne;
        int twoMiddle = endTwo-startTwo+1>=divide?startTwo+(divide-1):endTwo;
        if (nums1[oneMiddle]<nums2[twoMiddle]){
            return findMedian(k-(oneMiddle -startOne+1),nums1,oneMiddle+1,endOne,nums2,startTwo,endTwo);
        }else{
            return findMedian(k-(twoMiddle -startTwo+1),nums1,startOne,endOne,nums2,twoMiddle+1,endTwo);
        }
    }
}
