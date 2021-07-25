package org.sergey.solutions;

/*
Gray Code
An n-bit gray code sequence is a sequence of 2n integers where:

Every integer is in the inclusive range [0, 2n - 1],
The first integer is 0,
An integer appears no more than once in the sequence,
The binary representation of every pair of adjacent integers differs by exactly one bit, and
The binary representation of the first and last integers differs by exactly one bit.
Given an integer n, return any valid n-bit gray code sequence.
*/

import java.util.*;

public class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        if (n > 0) {
            for (int i = 0; i < (1<<n); i++) res.add(i ^ i >> 1);
        }
        return res;
    }
}
