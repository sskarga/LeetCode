package org.sergey.solutions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
Input: p = [1,2,3], q = [1,2,3]
Output: true

Input: p = [1,2], q = [1,null,2]
Output: false

Input: p = [1,2,1], q = [1,1,2]
Output: false
 */
class Solution100Test {

    private Solution100 tester;

    TreeNode buildTreeNode(Integer[] arr, int indexLayer) {
        if (indexLayer >= arr.length || arr[indexLayer] == null) return null;

        TreeNode leafLeft = buildTreeNode(arr, 2 * indexLayer + 1);
        TreeNode leafRight = buildTreeNode(arr, 2 * indexLayer + 2);

        return new TreeNode(arr[indexLayer], leafLeft, leafRight);
    }

    TreeNode arrayToTreeNode(Integer[] arr) {
        if (arr != null || arr.length > 0) {
            return buildTreeNode(arr, 0);
        } else {
            return new TreeNode();
        }
    }

    @BeforeEach
    void setUp() {
        tester = new Solution100();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isSameTree() {
        assertTrue(tester.isSameTree(
                arrayToTreeNode(new Integer[]{1, 2, 3}),
                arrayToTreeNode(new Integer[]{1, 2, 3})
                )
        );

        assertFalse(tester.isSameTree(
                arrayToTreeNode(new Integer[]{1, 2}),
                arrayToTreeNode(new Integer[]{1, null, 2})
                )
        );

        assertFalse(tester.isSameTree(
                arrayToTreeNode(new Integer[]{1, 2, 1}),
                arrayToTreeNode(new Integer[]{1, 1, 2})
                )
        );
    }
}