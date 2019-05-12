package com.pengnian.lc455;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-05-12 16:30
 */
class Solution {

    @Test
    void test() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(findContentChildren(g, s));
    }

    @Test
    void test2() {
        int[] g = {1, 2, 3,2,34,5,32,543,5,54,23,523,45,32,5,24};
        int[] s = {1, 1,2,34,45,4,3,2,34,5,5,42,7,65,3,53};
        System.out.println(findContentChildren(g, s));
    }

    private int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        List<Integer> list1 = new LinkedList<>(), list2 = new LinkedList<>();
        for (int integer : g) {
            list1.add(integer);
        }
        for (int integer : s) {
            list2.add(integer);
        }
        int result = 0;
        while (!list2.isEmpty() && !list1.isEmpty()) {
            if (list1.get(0) <= list2.get(0)) {
                result++;
                list1.remove(0);
                list2.remove(0);
            } else {
                list2.remove(0);
            }
        }
        return result;
    }
}
