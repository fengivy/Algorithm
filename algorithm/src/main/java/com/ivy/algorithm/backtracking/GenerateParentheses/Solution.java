package com.ivy.algorithm.backtracking.GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        getResult(result,n,"",0,0);
        return result;
    }

    private void getResult(List<String> result, int n,String lastStr,int leftNum,int rightNum) {
        if (leftNum<rightNum) {
            return;
        }
        if (leftNum == n && rightNum == n) {
            result.add(lastStr);
            return;
        }
        if (leftNum<n)
            getResult(result,n,lastStr+"(",leftNum+1,rightNum);
        getResult(result,n,lastStr+")",leftNum,rightNum+1);
    }
}
