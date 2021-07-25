package org.sergey.solutions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solusion4Test {

    private Solusion4 tester;

    @BeforeEach
    void setUp() {
        tester = new Solusion4();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findMedianSortedArrays() {
        assertEquals(2, tester.findMedianSortedArrays(new int[] {1,3}, new int[] {2}), "Test 1");
        assertEquals(2.5, tester.findMedianSortedArrays(new int[] {1,2}, new int[] {3,4}), "Test 2");
        assertEquals(0, tester.findMedianSortedArrays(new int[] {0,0}, new int[] {0,0}), "Test 3. Zero.");
        assertEquals(1, tester.findMedianSortedArrays(new int[] {}, new int[] {1}), "Test 4. Empty array");
        assertEquals(2, tester.findMedianSortedArrays(new int[] {2}, new int[] {}), "Test 5. Empty array");
        assertEquals(2.5, tester.findMedianSortedArrays(new int[] {1,3}, new int[] {2,7}), "Test 6.");
        assertEquals(7, tester.findMedianSortedArrays(new int[] {3, 7, 9}, new int[] {2,7}), "Test 7.");
    }
}