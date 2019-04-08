package com.pengnian.lc160;

import com.pengnian.listnode.ListNode;
import com.pengnian.listnode.ListNodeBuild;
import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-06 21:53
 */
class Solution {

    @Test
    public void test1() {
        int[] a1 = {4, 1, 8, 4, 5}, a2 = {5, 0, 1};
        int skipA = 2, skipB = 3;
        ListNode l1 = ListNodeBuild.buildListNode(a1), l2 = ListNodeBuild.buildListNode(a2);
        ListNode cross1 = l1, cross2 = l2;
        while (skipA > 0) {
            cross1 = cross1.next;
            skipA--;
        }
        while (skipB > 1) {
            cross2 = cross2.next;
            skipB--;
        }
        cross2.next = cross1;
        ListNode IntersectionNode = getIntersectionNode(l1,l2);
        System.out.println(IntersectionNode.val);
    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA!=null){
            ListNode curListB = headB;
            while(curListB!=null){
                if(curListB==headA)
                    return headA;
                curListB = curListB.next;
            }
            headA = headA.next;
        }
        return null;
    }
}
