package org.sergey.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution89Test {

    private Solution89 tester;

    @BeforeEach
    void setUp() {
        tester = new Solution89();
    }

    @Test
    void grayCode() {
        int[] ints = tester.grayCode(2).stream().mapToInt(Integer::intValue).toArray();
        assertArrayEquals(new int[] {0,1,3,2}, ints);

        ints = tester.grayCode(1).stream().mapToInt(Integer::intValue).toArray();
        assertArrayEquals(new int[] {0,1}, ints);
    }
}