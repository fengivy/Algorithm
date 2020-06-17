package com.ivy.algorithm.array.WordBreakII;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("-------------:"+new Solution().wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa")));
        System.out.println("-------------:"+new Solution().wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
        System.out.println("-------------:"+new Solution().wordBreak("pineapplepenapple", Arrays.asList("apple", "pen", "applepen", "pine", "pineapple")));
        System.out.println("-------------:"+new Solution().wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
        String a = "你好我是帅哥";
        System.out.println("--------s:"+a);
        for (int i = 0; i < a.length(); i++) {
            System.out.println("-------:"+(a.charAt(i)));
        }
    }
}
