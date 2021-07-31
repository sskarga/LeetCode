import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sergey.solutions.Solution5;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {
    private Solution5 tester;

    @BeforeEach
    void setUp() {
        tester = new Solution5();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void longestPalindrome() {
        long startTime = System.currentTimeMillis();
        assertEquals("a", tester.longestPalindrome("a"));
        assertEquals("a", tester.longestPalindrome("ac"));
        assertEquals("bb", tester.longestPalindrome("cbbd"));
        assertEquals("bab", tester.longestPalindrome("babad"));
        assertEquals("anna", tester.longestPalindrome("anna"));
        assertEquals("samdmas", tester.longestPalindrome("evd dfgd samdmasgg "));
        assertEquals("ccc", tester.longestPalindrome("ccc"));
        assertEquals("aaaa", tester.longestPalindrome("aaaa"));
        assertEquals("aca", tester.longestPalindrome("aacabdkacaa"));
        assertEquals("aabbaa", tester.longestPalindrome("aaaabbaa"));

        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}