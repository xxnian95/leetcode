package com.pengnian.lc203;

import com.pengnian.listnode.ListNode;
import com.pengnian.listnode.ListNodeBuild;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author Zhang Pengnian
 * @date 2019-04-07 12:00
 */
public class Solution {

    @Test
    public void test() {
        int[] a = {1, 2, 6, 3, 4, 5, 6};
        int val = 6;
        ListNode head = ListNodeBuild.buildListNode(a);
        ListNode result = removeElements(head, val);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void test2() {
        int[] a = {6,6,6,6,6};
        int val = 6;
        ListNode head = ListNodeBuild.buildListNode(a);
        ListNode result = removeElements(head, val);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            if (head.val != val) {
                list.add(head.val);
            }
            head = head.next;
        }

        if(list.isEmpty())
            return null;

        ListNode result = new ListNode(0);
        ListNode resultHead = result;
        boolean firstFlag = true;
        for (int x : list) {
            if (firstFlag) {
                result.val = x;
                firstFlag = false;
            } else {
                result.next = new ListNode(x);
                result = result.next;
            }
        }

        return resultHead;

    }
}
