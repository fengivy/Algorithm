package com.ivy.algorithm.other.Pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    rows.add(1);
                } else if (j == i) {
                    rows.add(1);
                }else{
                    List<Integer> last = result.get(result.size()-1);
                    rows.add(last.get(j-1)+last.get(j));
                }
            }
            result.add(rows);
        }
        return result;
    }
}
