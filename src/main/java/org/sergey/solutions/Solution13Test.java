package org.sergey.solutions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution13Test {

    private final Map<String, Integer> romanToIntData = new HashMap<>();
    private Solution13 sol;

    @BeforeEach
    void setUp() {
        sol = new Solution13();
        romanToIntData.put("MCMXCIV",1994);
        romanToIntData.put("DCXXI",621);
        romanToIntData.put("III",3);
        romanToIntData.put("IV",4);
        romanToIntData.put("IX",9);
        romanToIntData.put("LVIII",58);
    }

    @AfterEach
    void tearDown() {
        romanToIntData.clear();
    }

    @Test
    @DisplayName("Convert Roman numeral to int")
    void testRomanToInt() {
        for ( Map.Entry<String , Integer> entry: romanToIntData.entrySet()) {
            String roman = entry.getKey();
            Integer num = entry.getValue();
            assertEquals(num, sol.romanToInt(roman), "Not equals convert roman: " + roman + " to int: " + num);
        }
    }
}