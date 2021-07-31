import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sergey.solutions.Solution1047;

import static org.junit.jupiter.api.Assertions.*;

class Solution1047Test {
    private Solution1047 tester;

    @BeforeEach
    void setUp() {
        tester = new Solution1047();
    }

    @Test
    void removeDuplicates() {
        assertEquals("ca", tester.removeDuplicates("abbaca"));
        assertEquals("ay", tester.removeDuplicates("azxxzy"));
    }
}