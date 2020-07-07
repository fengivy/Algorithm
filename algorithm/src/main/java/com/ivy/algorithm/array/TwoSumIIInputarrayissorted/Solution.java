package com.ivy.algorithm.array.TwoSumIIInputarrayissorted;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(target-numbers[i])){
                return new int[]{hashMap.get(target-numbers[i])+1,i+1};
            }else{
                hashMap.put(numbers[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
