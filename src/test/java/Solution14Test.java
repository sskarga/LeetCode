import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sergey.solutions.Solution14;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution14Test {


    private Solution14 tester;

    @BeforeEach
    void setUp() {
        tester = new Solution14();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void longestCommonPrefix() {
        assertEquals("fl", tester.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        assertEquals("", tester.longestCommonPrefix(new String[] {"dog","racecar","car"}));
        assertEquals("", tester.longestCommonPrefix(new String[0]));
    }
}