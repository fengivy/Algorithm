package com.ivy.algorithm.array.MajorityElement;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        int count = size/2;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i],hashMap.get(nums[i])+1);
            }else{
                hashMap.put(nums[i],1);
            }
            if (hashMap.get(nums[i]) > count) {
                return nums[i];
            }
        }
        return -1;
    }
}
