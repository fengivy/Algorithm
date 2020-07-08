package com.ivy.algorithm.swordOffer.twoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target-nums[i])){
                return new int[]{target-nums[i],nums[i]};
            }else{
                hashMap.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
