package org.sergey.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution378Test {

    private Solution378 tested;

    @BeforeEach
    void setUp() {
        tested = new Solution378();
    }

    @Test
    void kthSmallest() {
        assertEquals(13, tested.kthSmallest(new int[][]{{1,5,9}, {10,11,13},{12,13,15}}, 8));
        assertEquals(-5, tested.kthSmallest(new int[][]{{-5}}, 1));
        assertEquals(1, tested.kthSmallest(new int[][]{{1,2},{1,3}}, 2));
    }
}