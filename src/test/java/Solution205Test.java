import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sergey.solutions.Solution205;

import static org.junit.jupiter.api.Assertions.*;

class Solution205Test {

    private Solution205 tested;

    @BeforeEach
    void setUp() {
        tested = new Solution205();
    }

    @Test
    void isIsomorphic() {
        assertTrue(tested.isIsomorphic("egg","add"));
        assertTrue(tested.isIsomorphic("paper","title"));
        assertFalse(tested.isIsomorphic("foo","bar"));
        assertFalse(tested.isIsomorphic("badc","baba"));
        assertFalse(tested.isIsomorphic("bbbaaaba","aaabbbba"));
    }
}