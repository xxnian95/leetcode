package com.pengnian.HOT100.lc2;

import com.pengnian.listnode.ListNode;
import com.pengnian.listnode.ListNodeBuild;
import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-07-08 00:40
 */
class Solution {

    @Test
    void test() {
        int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                b = {1, 2, 3};
        ListNode l1 = ListNodeBuild.buildListNode(a), l2 = ListNodeBuild.buildListNode(b);
        ListNode listNode = addTwoNumbers(l1, l2);
        while (listNode != null) {
            if (listNode.next == null)
                System.out.print(listNode.val);
            else
                System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
        System.out.println(" ");
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //long的范围依然不够
//        long num1 = 0, num2 = 0;
//        long digit = 1;
//        while (l1 != null) {
//            num1 += l1.val * digit;
//            l1 = l1.next;
//            digit *= 10;
//        }
//        digit = 1;
//        while (l2 != null) {
//            num2 += l2.val * digit;
//            l2 = l2.next;
//            digit *= 10;
//        }
//        long sum = num1 + num2;
//        ListNode result = new ListNode((int) (sum % 10));
//        ListNode point = result;
//        sum /= 10;
//        while (sum != 0) {
//            point.next = new ListNode((int) (sum % 10));
//            sum /= 10;
//            point = point.next;
//        }
//        return result;

        ListNode result = new ListNode(0);
        ListNode p = result;
        boolean first = true;
        int carry = 0;
        while (l1 != null && l2 != null) {
            if (first) {
                int sum = l1.val + l2.val;
                if (sum < 10) {
                    p.val = sum;
                } else {
                    p.val = sum - 10;
                    carry = 1;
                }
                first = false;
                l1 = l1.next;
                l2 = l2.next;
            } else {
                int sum = l1.val + l2.val + carry;
                carry = 0;
                if (sum < 10) {
                    p.next = new ListNode(sum);
                } else {
                    p.next = new ListNode(sum - 10);
                    carry = 1;
                }
                l1 = l1.next;
                l2 = l2.next;
                p = p.next;

            }
        }

        if (!(l1 == null && l2 == null)) {
            ListNode rest;
            if (l1 != null)
                rest = l1;
            else
                rest = l2;
            while (rest != null || carry == 1) {
                if (rest != null) {
                    int sum = rest.val + carry;
                    carry = 0;
                    if (sum < 10) {
                        p.next = new ListNode(sum);
                    } else {
                        p.next = new ListNode(sum - 10);
                        carry = 1;
                    }
                    rest = rest.next;
                    p = p.next;
                } else {
                    p.next = new ListNode(1);
                    carry = 0;
                }
            }
        } else if (carry==1)
            p.next = new ListNode(1);
        return result;
    }
}
