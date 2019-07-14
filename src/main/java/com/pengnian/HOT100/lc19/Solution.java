package com.pengnian.HOT100.lc19;


import com.pengnian.listnode.ListNode;
import com.pengnian.listnode.ListNodeBuild;
import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-07-14 16:50
 */
class Solution {

    @Test
    void test() {
        int[] nums = {1, 2, 3, 4, 5,6,7,8,9};
//        int[] nums = {1,2};
        int n = 9;
        ListNode ln = ListNodeBuild.buildListNode(nums);
        ListNode result = removeNthFromEnd(ln, n);
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }

    private ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front = head, behind = head;
        for (int i = 0; i < n; i++)
            behind = behind.next;
        if (behind == null)
            return head.next;
        while (behind.next != null) {
            behind = behind.next;
            front = front.next;
        }
        if (front.next != null)
            front.next = front.next.next;
        return head;
    }
}
