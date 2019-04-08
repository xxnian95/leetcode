package com.pengnian.listnode;

/**
 * @author Zhang Pengnian
 * @date 2019-04-04 14:42
 */
public class ListNodeBuild {

    public static ListNode buildListNode(int[] input) {
        ListNode first = null, last = null, newNode;
        int num;
        if (input.length > 0) {
            for (int i = 0; i < input.length; i++) {
                newNode = new ListNode(input[i]);
                newNode.next = null;
                if (first == null) {
                    first = newNode;
                    last = newNode;
                } else {
                    last.next = newNode;
                    last = newNode;
                }

            }
        }
        return first;
    }
}
