import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sergey.solutions.ListNode;
import org.sergey.solutions.ListNodeUntil;
import org.sergey.solutions.Solution2;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    class TestNode {
        public Integer[] l1;
        public Integer[] l2;
        public Integer[] result;
    }

    private Solution2 tester;
    private LinkedList<TestNode> testNodes = new LinkedList<>();

    @BeforeEach
    void setUp() {
        tester = new Solution2();
        TestNode testNode = new TestNode();

        testNode.l1 = new Integer[]{9,9,9,9,9,9,9};
        testNode.l2 = new Integer[]{9,9,9,9};
        testNode.result = new Integer[]{8,9,9,9,0,0,0,1};
        testNodes.add(testNode);

        testNode.l1 = new Integer[]{0};
        testNode.l2 = new Integer[]{0};
        testNode.result = new Integer[]{0};
        testNodes.add(testNode);

        testNode.l1 = new Integer[]{2,4,3};
        testNode.l2 = new Integer[]{5,6,4};
        testNode.result = new Integer[]{7,0,8};
        testNodes.add(testNode);

    }


    @AfterEach
    void tearDown() {
        testNodes.clear();
    }

    @Test
    void addTwoNumbers() {
        ListNode l1;
        ListNode l2;
        Integer[] result;

        for (TestNode t: testNodes) {
            l1 = ListNodeUntil.arrayToListNode(t.l1);
            l2 = ListNodeUntil.arrayToListNode(t.l2);
            result = ListNodeUntil.listNodeToArray(tester.addTwoNumbers(l1, l2));

            assertArrayEquals(t.result, result, "Test data: " + Arrays.toString(t.result) + " != " + Arrays.toString(result));
        }

    }
}