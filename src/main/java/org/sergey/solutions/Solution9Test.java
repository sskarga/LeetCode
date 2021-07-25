package org.sergey.solutions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution9Test {

    private final Map<Integer, Boolean> testData = new HashMap<>();
    private Solution9 tester;

    @BeforeEach
    void setUp() {
        tester = new Solution9();
        testData.put(121, true);
        testData.put(-121, false);
        testData.put(1, true);
        testData.put(0, true);
        testData.put(51215, true);
        testData.put(51213, false);
    }

    @AfterEach
    void tearDown() {
        testData.clear();
    }

    @Test
    void isPalindrome() {
        for ( Map.Entry<Integer , Boolean> entry: testData.entrySet()) {
            Integer input = entry.getKey();
            Boolean result = entry.getValue();
            assertEquals(
                    result,
                    tester.isPalindrome(input),
                    "Not equals. Input: " + input + ". Result: " + result
            );
        }
    }
}