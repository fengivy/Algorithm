package com.ivy.algorithm.DynamicPlanning.Subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int n = result.size();
            for (int j = 0; j < n; j++) {
                List<Integer> contact = new ArrayList<>(result.get(j));
                contact.add(nums[i]);
                result.add(contact);
            }
            List<Integer> single = new ArrayList<>();
            single.add(nums[i]);
            result.add(single);
        }
        result.add(new ArrayList<Integer>());
        return result;
    }
}
