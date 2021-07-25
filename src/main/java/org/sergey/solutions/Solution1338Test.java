package org.sergey.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1338Test {

    private Solution1338 tested;

    @BeforeEach
    void setUp() {
        tested = new Solution1338();
    }

    @Test
    void minSetSize() {
        assertEquals(2, tested.minSetSize(new int[]{3,3,3,3,5,5,5,2,2,7}));
        assertEquals(1, tested.minSetSize(new int[]{7,7,7,7,7,7}));
        assertEquals(1, tested.minSetSize(new int[]{1,9}));
        assertEquals(1, tested.minSetSize(new int[]{1000,1000,3,7}));
        assertEquals(5, tested.minSetSize(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
}