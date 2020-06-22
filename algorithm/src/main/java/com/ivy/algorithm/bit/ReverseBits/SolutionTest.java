package com.ivy.algorithm.bit.ReverseBits;


import java.math.BigInteger;

public class SolutionTest {
    public static void main(String[] args) {
        int value = Integer.valueOf("00000010100101000001111010011100",2);
        System.out.println("--------------:"+Integer.toBinaryString(new Solution().reverseBits(value)));
    }
}
