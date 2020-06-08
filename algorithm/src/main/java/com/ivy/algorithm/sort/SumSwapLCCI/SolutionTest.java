package com.ivy.algorithm.sort.SumSwapLCCI;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("---------------:"+ Arrays.toString(new Solution().findSwapValues(new int[]{4, 1, 2, 1, 1, 2},new int[]{3,6,3,3})));
       System.out.println("---------------:"+ Arrays.toString(new Solution().findSwapValues(new int[]{1,2,3},new int[]{4,5,6})));
        System.out.println("---------------:"+ Arrays.toString(new Solution().findSwapValues(new int[]{519, 886, 282, 382, 662, 4718, 258, 719, 494, 795},new int[]{52, 20, 78, 50, 38, 96, 81, 20})));
        System.out.println("---------------:"+ Arrays.toString(new Solution().findSwapValues(new int[]{70, 47, 48, 77, 95, 82, 59, 81, 87, 58, 77, 29, 85, 27, 14, 77, 37, 60, 59, 45, 53, 96, 57, 53, 49, 54, 49, 70, 29, 23, 19, 94, 78, 78, 52, 79, 91, 65, 62, 70, 79, 12, 64, 2224, 28, 90, 83, 49, 68, 93},new int[]{43, 5, 43, 32, 21, 32, 67, 46, 1, 100, 86, 48, 32, 13, 65, 52, 94, 87, 55, 43})));

    }
}
