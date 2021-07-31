import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sergey.solutions.Solution718;

import static org.junit.jupiter.api.Assertions.*;

class Solution718Test {

    private Solution718 tested;

    @BeforeEach
    void setUp() {
        tested = new Solution718();
    }

    @Test
    void findLength() {
        assertEquals(3, tested.findLength(new int []{1,2,3,2,1}, new int[]{3,2,1,4,7}));
        assertEquals(5, tested.findLength(new int []{0,0,0,0,0}, new int[]{0,0,0,0,0}));
        assertEquals(4, tested.findLength(new int []{0,0,0,0,1}, new int[]{1,0,0,0,0}));
        assertEquals(9, tested.findLength(new int []{0,0,0,0,0,0,1,0,0,0}, new int[]{0,0,0,0,0,0,0,1,0,0}));
    }
}