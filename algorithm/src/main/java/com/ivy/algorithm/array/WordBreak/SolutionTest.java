package com.ivy.algorithm.array.WordBreak;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("------------:"+new Solution().wordBreak("leetcode", Arrays.asList(new String[]{"leet", "code"})));
        System.out.println("------------:"+new Solution().wordBreak("applepenapple", Arrays.asList(new String[]{"apple", "pen"})));
        System.out.println("------------:"+new Solution().wordBreak("catsandog", Arrays.asList(new String[]{"cats", "dog", "sand", "and", "cat"})));
    }
}
