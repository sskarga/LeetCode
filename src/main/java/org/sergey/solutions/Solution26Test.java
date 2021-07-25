package org.sergey.solutions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {

    private Solution26 tester;

    @BeforeEach
    void setUp() {
        tester = new Solution26();
    }

    @Test
    void removeDuplicates() {
        int[] nums = new int[] {1,1,2}; // Input array
        int[] expectedNums = new int[]{1,2}; // The expected answer with correct length

        int k = tester.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

        assertEquals(2, k);

    }
}