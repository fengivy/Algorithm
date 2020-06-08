package com.ivy.algorithm.sort.LongestWordinDictionarythroughDeleting;

import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("-------------:"+new Solution().findLongestWord("abpcplea", Arrays.asList("ale","apple","monkey","plea")));
        System.out.println("-------------:"+new Solution().findLongestWord("abpcplea", Arrays.asList("a","b","c")));
        System.out.println("-------------:"+new Solution().findLongestWord("aewfafwafjlwajflwajflwafj", Arrays.asList("apple","ewaf","awefawfwaf","awef","awefe","ewafeffewafewf")));
    }
}
