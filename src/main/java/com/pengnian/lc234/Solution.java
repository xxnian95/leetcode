package com.pengnian.lc234;

import com.pengnian.listnode.ListNode;
import com.pengnian.listnode.ListNodeBuild;
import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @author Zhang Pengnian
 * @date 2019-04-11 21:24
 */
class Solution {

    @Test
    void test() {
        int[] a = {1,2};
        ListNode head = ListNodeBuild.buildListNode(a);
        System.out.println(isPalindrome(head));
    }

    private boolean isPalindrome(ListNode head) {
        ListNode node = head;
        int N = 0;
        while (node != null) {
            node = node.next;
            N++;
        }
        Stack<Integer> stack = new Stack<>();
        int currentPosition = 0;
        node = head;
        while (currentPosition < N / 2) {
            stack.push(node.val);
            currentPosition++;
            node = node.next;
        }
        if (N % 2 != 0)
            node = node.next;

        while (node != null) {
            if (node.val != stack.pop())
                return false;
            node = node.next;
        }

        return true;
    }
}
