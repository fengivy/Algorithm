package com.ivy.algorithm.other.UTFEightValidation;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean validUtf8(int[] data) {
        if (data == null || data.length == 0) {
            return false;
        }
        Queue<String> queue = new LinkedList<>();
        for(int i=0;i<data.length;i++){
            queue.add(getLowEightBit(data[i]));
        }
        return false;
    }

    private String getLowEightBit(int datum) {
        return null;
    }
}
