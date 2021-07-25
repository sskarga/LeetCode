package org.sergey.solutions;

/*
2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Constraints:
    The number of nodes in each linked list is in the range [1, 100].
    0 <= Node.val <= 9
    It is guaranteed that the list represents a number that does not have leading zeros.
*/

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode nextL1 = l1;
        ListNode nextL2 = l2;
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int sum = 0;

        while (nextL1 != null || nextL2 != null) {
            sum = curr.val;

            if (nextL1 != null) {
                sum += nextL1.val;
                nextL1 = nextL1.next;
            };

            if (nextL2 != null) {
                sum += nextL2.val;
                nextL2 = nextL2.next;
            };

            curr.val = sum % 10;

            if (sum > 9 || nextL1 != null || nextL2 != null) {
                curr.next = new ListNode(sum / 10);
                curr = curr.next;
            }
        }

        return result;
    }
}
