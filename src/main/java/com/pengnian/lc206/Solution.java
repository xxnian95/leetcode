package com.pengnian.lc206;

import com.pengnian.listnode.ListNode;
import com.pengnian.listnode.ListNodeBuild;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

/**
 * @author Zhang Pengnian
 * @date 2019-04-10 15:18
 */
class Solution {

    @Test
    void test() {
        int[] a = {1, 2, 3, 4, 5};
        ListNode head = ListNodeBuild.buildListNode(a);
        ListNode ReverseList = reverseList(head);
        while (ReverseList != null) {
            System.out.println(ReverseList.val);
            ReverseList = ReverseList.next;
        }
    }

    // 迭代
    private ListNode reverseList(ListNode head) {
        ListNode node = head;
        LinkedList<Integer> list = new LinkedList<>();
        while (node != null) {
            list.add(0, node.val);
            node = node.next;
        }
        node = head;
        int index = 0;
        while(node!=null) {
            node.val = list.get(index++);
            node = node.next;
        }
        return head;

    }
}
