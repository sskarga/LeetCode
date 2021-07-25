package org.sergey.solutions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution20Test {

    private final Map<String, Boolean> testData = new HashMap<>();
    private Solution20 tester;

    @BeforeEach
    void setUp() {
        tester = new Solution20();
        testData.put("()", true);
        testData.put("()[]{}", true);
        testData.put("(]", false);
        testData.put("([)]", false);
        testData.put("{[]}", true);
        testData.put("{[({(())})]}", true);
        testData.put("{(([)])}", false);
        testData.put("([]", false);
        testData.put("]", false);
        testData.put(")(){}", false);
    }

    @AfterEach
    void tearDown() {
        testData.clear();
    }

    @Test
    public void isValid() {
        for ( Map.Entry<String , Boolean> entry: testData.entrySet()) {
            String input = entry.getKey();
            Boolean result = entry.getValue();
            assertEquals(
                    result,
                    tester.isValid(input),
                    "Not equals. Input: " + input + ". Result: " + result
            );
        }
    }

}