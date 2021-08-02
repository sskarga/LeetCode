import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sergey.solutions.Solution42;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    private Solution42 tester;

    @BeforeEach
    void setUp() {
        tester = new Solution42();
    }

    @Test
    void trap() {
        assertEquals(6, tester.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}) );
        assertEquals(9, tester.trap(new int[]{4,2,0,3,2,5}));
        assertEquals(1, tester.trap(new int[]{4,2,3}));
        assertEquals(23, tester.trap(new int[]{5,5,1,7,1,1,5,2,7,6}));
    }
}