import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sergey.solutions.Solution3;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    private final Map<String, Integer> testData = new HashMap<>();
    private Solution3 tester;

    @BeforeEach
    void setUp() {
        tester = new Solution3();
        testData.put("abcabcbb", 3);
        testData.put("bbbbb", 1);
        testData.put("pwwkew", 3);
        //testData.put("", 0);
        testData.put("au", 2);
        testData.put("abba", 2);
    }

    @AfterEach
    void tearDown() {
        testData.clear();
    }

    @Test
    void lengthOfLongestSubstring() {
        for (Map.Entry test: testData.entrySet()) {
            assertEquals(
                    test.getValue(),
                    tester.lengthOfLongestSubstring(test.getKey().toString()),
                    "Test lengthOfLongestSubstring. Input: "
                            + test.getKey().toString());
        }
    }
}