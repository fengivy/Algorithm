package com.ivy.algorithm.math.HappyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)){
            set.add(n);
            int result = 0;
            while (n!=0){
                result += Math.pow(n%10,2);
                n/=10;
            }
            if (result == 1) {
                return true;
            }else{
                n = result;
            }
        }
        return false;
    }
}
