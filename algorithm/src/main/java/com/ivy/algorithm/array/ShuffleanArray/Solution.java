package com.ivy.algorithm.array.ShuffleanArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Solution {
    private int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] result = new int[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            int index = new Random().nextInt(list.size());
            int value = nums[list.get(index)];
            result[i] = value;
            list.remove(index);
        }
        return result;
    }
}
