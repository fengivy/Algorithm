package com.ivy.algorithm.array.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++) {
            result.add(1);
            for (int j = i-1; j >=1; j--) {
                result.set(j,result.get(j)+result.get(j-1));
            }
        }
        return result;
    }
}
