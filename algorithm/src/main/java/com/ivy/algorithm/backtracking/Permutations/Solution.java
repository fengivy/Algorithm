package com.ivy.algorithm.backtracking.Permutations;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        getResult(nums,new LinkedHashSet<Integer>(),result);
        return result;
    }

    private void getResult(int[] nums, LinkedHashSet<Integer> last,List<List<Integer>> result) {
        if (last.size() == nums.length) {
            result.add(new ArrayList<>(last));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!last.contains(nums[i])){
                last.add(nums[i]);
                getResult(nums,last,result);
                last.remove(nums[i]);
            }
        }
    }
}
