package com.ivy.algorithm.sort.CountofSmallerNumbersAfterSelf;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //todo overtime, use sort and more space handle it
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = i + 1; j < size; j++) {
                if (nums[i]>nums[j]){
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }
}
