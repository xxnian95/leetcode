package com.pengnian.lc237;

import com.pengnian.listnode.ListNode;
import com.pengnian.listnode.ListNodeBuild;
import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-07 11:01
 */
public class Solution {

    @Test
    public void test() {
        int[] a = {4, 5, 1, 9};
        ListNode head = ListNodeBuild.buildListNode(a);
        ListNode node = head.next.next;
        deleteNode(node);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }


    public void deleteNode(ListNode node) {
//        while (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
//        }

    }
}
