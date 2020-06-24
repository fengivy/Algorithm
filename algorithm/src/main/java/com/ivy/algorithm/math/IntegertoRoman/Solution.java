package com.ivy.algorithm.math.IntegertoRoman;

public class Solution {
    /*I             1
      V             5
      X             10
      L             50
      C             100
      D             500
      M             1000*/

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        String[] strs = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] values =new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        for (int i = values.length - 1; i >= 0; i--) {
            if (num>=values[i]){
                int value = num/values[i];
                for (int j = 0; j < value; j++) {
                    sb.append(strs[i]);
                }
                num = num%values[i];
            }
        }
        return sb.toString();
    }
}
