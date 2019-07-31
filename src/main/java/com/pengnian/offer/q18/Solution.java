package com.pengnian.offer.q18;

import com.pengnian.listnode.ListNode;
import com.pengnian.listnode.ListNodeBuild;
import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-07-31 16:36
 */
class Solution {

    @Test
    void test() {
        int[] a = {1, 2, 3, 3, 4, 4, 5};
        ListNode head = ListNodeBuild.buildListNode(a);
        deleteDuplication(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    @Test
    void test2() {
        int[] a = {1, 1, 1, 1, 1, 1};
        ListNode head = ListNodeBuild.buildListNode(a);
        head = deleteDuplication(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }


    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        } else if (pHead.next == null) {
            return pHead;
        }
        ListNode beforeHead = new ListNode(Integer.MIN_VALUE);
        beforeHead.next = pHead;
        ListNode node = pHead.next, preNode = beforeHead;
        while (node != null) {
            boolean hasDuplication = false;
            while (node != null && node.val == preNode.next.val) {
                hasDuplication = true;
                node = node.next;
            }
            //循环结束后，node指向preHead后面第一个不重复的节点
            if (node == null) {
                preNode.next = null;
                break;
            } else {
                //之前没有删除重复的元素，因此preHead后移一位。如果删除了，那么preHead保持原位。
                if (!hasDuplication) {
                    preNode = preNode.next;
                } else {
                    preNode.next = node;
                }
                node = node.next;
            }
        }
        return beforeHead.next;
    }
}
