package com.ivy.algorithm.sort.PermutationSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        List<String> result = new ArrayList<>();
        findAllComposition(list,k,new StringBuilder(),result);
        return result.get(result.size()-1);
    }

    private void findAllComposition(List<Integer> list, int k,StringBuilder sb,List<String> result) {
        if (list.size() == 0) {
            result.add(sb.toString());
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            list.remove((int)i);
            sb.append(value);
            findAllComposition(list,k,sb,result);
            sb.deleteCharAt(sb.length()-1);
            list.add(i,value);
            if (result.size() == k) {
                return;
            }
        }
    }
}
