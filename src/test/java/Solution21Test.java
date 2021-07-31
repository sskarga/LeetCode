import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sergey.solutions.ListNode;
import org.sergey.solutions.ListNodeUntil;
import org.sergey.solutions.Solution21;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class Solution21Test {

    class TestNode {
        public Integer[] l1;
        public Integer[] l2;
        public Integer[] result;
    }

    private Solution21 tester;
    private LinkedList<Solution21Test.TestNode> testNodes = new LinkedList<>();

    @BeforeEach
    void setUp() {
        tester = new Solution21();
        TestNode testNode = new Solution21Test.TestNode();

        testNode.l1 = new Integer[]{1, 2, 4};
        testNode.l2 = new Integer[]{1, 3, 4};
        testNode.result = new Integer[]{1, 1, 2, 3, 4, 4};
        testNodes.add(testNode);

        testNode.l1 = new Integer[]{1};
        testNode.l2 = new Integer[]{2};
        testNode.result = new Integer[]{1, 2};
        testNodes.add(testNode);

        testNode.l1 = new Integer[]{1};
        testNode.l2 = new Integer[]{3, 4, 7};
        testNode.result = new Integer[]{1, 3, 4, 7};
        testNodes.add(testNode);
    }

    @AfterEach
    void tearDown() {
        testNodes.clear();
    }

    @Test
    void mergeTwoLists() {
        ListNode l1;
        ListNode l2;
        Integer[] result;

        for (Solution21Test.TestNode t : testNodes) {
            l1 = ListNodeUntil.arrayToListNode(t.l1);
            l2 = ListNodeUntil.arrayToListNode(t.l2);
            result = ListNodeUntil.listNodeToArray(tester.mergeTwoLists(l1, l2));

            assertArrayEquals(t.result, result, "Test data: " + Arrays.toString(t.result) + " != " + Arrays.toString(result));
        }
    }
}