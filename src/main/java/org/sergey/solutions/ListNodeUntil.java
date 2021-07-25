package org.sergey.solutions;

import java.util.LinkedList;

public class ListNodeUntil {
    public static ListNode arrayToListNode(Integer[] arr) {
        ListNode l = new ListNode(0);
        ListNode nextL;
        if (arr.length == 0) return l;
        nextL = l;
        l.val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            nextL.next = new ListNode(arr[i]);
            nextL = nextL.next;
        }
        return l;
    }

    public static Integer[] listNodeToArray(ListNode node) {
        LinkedList<Integer> list = new LinkedList<>();
        if (node == null) return new Integer[0];
        list.add(node.val);
        ListNode nextNode = node.next;
        while (nextNode != null) {
            list.add(nextNode.val);
            nextNode = nextNode.next;
        }

        return list.stream().toArray(size -> new Integer[size]);
    }
}
