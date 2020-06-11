package com.ivy.algorithm.array.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        int lastI = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == lastI) { //使用过i了，跳过
                continue;
            }
            lastI = nums[i];//记录上一次使用的I
            if (nums[i]>0){//大于0不处理
                break;
            }
            int j=i+1;
            int k = nums.length-1;
            int lastK = -1;
            while (j < k) {
                int value = nums[i] + nums[j] + nums[k];
                if (value == 0) {
                    if (nums[k]!=lastK){ //在当前i下，没有使用过该第三个数
                        lastK = nums[k];
                        List<Integer>  item = new ArrayList<>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(nums[k]);
                        result.add(item);
                    }
                    j++;
                    k--;
                } else if (value < 0) {
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;
    }
}
