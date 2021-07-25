package org.sergey.solutions;

/*
21. Merge Two Sorted Lists
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes
of the first two lists.

Constraints:
    The number of nodes in both lists is in the range [0, 50].
    -100 <= Node.val <= 100
    Both l1 and l2 are sorted in non-decreasing order.

 */

public class Solution21 {
    //    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
//
//        if (l1 == null && l2 == null) return new ListNode();
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//
//        ListNode tList1 = l1;
//        ListNode tList2 = l2;
//        int maxEl;
//        ListNode result = new ListNode();
//        ListNode headList = result.next;
//
//        while (l1.next != null || l2.next != null) {
//
//                if (l1.next != null && l2.next != null) {
//                    if (tList1.val <= tList2.val) {
//                        maxEl = tList1.val;
//                        tList1 = tList1.next;
//                    } else {
//                        maxEl = tList2.val;
//                        tList2 = tList2.next;
//                    };
//                } else {
//                    if (l1.next != null) {
//                }
//
//                result.next = new ListNode(maxEl);
//                result = result.next;
//
//        }
//        return headList;
//    }
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode ans = new ListNode();
        ListNode ansHead = ans;

        while (l1 != null || l2 != null) {

            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    ans.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    ans.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            } else {
                if (l1 != null) {
                    ans.next = new ListNode(l1.val);
                    l1 = l1.next;
                } else {
                    ans.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
            }

            ans = ans.next;
        }

        return ansHead.next;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode ans = new ListNode();
        ListNode ansHead = ans;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                ans.next = l1;
                l1 = l1.next;
            } else {
                ans.next = l2;
                l2 = l2.next;
            }

            ans = ans.next;
        }

        ans.next = l1 != null ? l1 : l2;

        return ansHead.next;
    }
}
