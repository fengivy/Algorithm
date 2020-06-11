package com.ivy.algorithm.DynamicPlanning.Triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        a.add(Arrays.asList(-1));
        a.add(Arrays.asList(2,3));
        a.add(Arrays.asList(1,-1,-3));
        System.out.println("---------:"+new Solution().minimumTotal(a));
    }
}
