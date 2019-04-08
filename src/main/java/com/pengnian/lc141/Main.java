package com.pengnian.lc141;

import com.pengnian.listnode.ListNode;
import org.junit.jupiter.api.Test;

import static com.pengnian.listnode.ListNodeBuild.buildListNode;

/**
 * @author Zhang Pengnian
 * @date 2019-04-04 14:20
 */

/*
给定一个链表，判断链表中是否有环。
为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
如果 pos 是 -1，则在该链表中没有环。
 */
class Main {

    @Test
    public void test() {
        int[] a = {-21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16, 27, -12, 6, 29, -12, 5, 9, 20, 14, 14, 2, 13, -24, 21, 23, -21, 5};
        int pos = -1;
        ListNode head = buildListNode(a);
        ListNode end = head, point = head;
        while (end.next != null) {
            end = end.next;
        }
        while (pos > 0 && point.next != null) {
            point = point.next;
            pos--;
        }
        if (pos >= 0)
            end.next = point;
        System.out.println(hasCycle(head));
//        System.out.println(end);

    }

    private boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode n1 = head, n2 = head;
        if (head.next != null)
            n1 = n1.next;
        else
            return false;

        return hasCycle(n1, n2);

    }

    private boolean hasCycle(ListNode n1, ListNode n2) {
        int count = 5000;
        while (count > 0) {

            if (n1.next == null || n2.next == null)
                return false;
            if (n1.equals(n2))
                return true;
            n1 = n1.next;
            if (n1.next == null)
                return false;
            else
                n1 = n1.next;
            n2 = n2.next;
            if (n1.equals(n2))
                return true;
            count--;
        }
        return true;
    }


}
