package com.pengnian.lc383;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Zhang Pengnian
 * @date 2019-04-19 09:45
 */
class Solution {

    @Test
    void test() {
        String a = "abcd", b = "abdce";
        System.out.println(canConstruct(a, b));
    }

    private boolean canConstruct(String ransomNote, String magazine) {
        LinkedList<Character> list1 = new LinkedList<>(), list2 = new LinkedList<>();
        char[] c1 = ransomNote.toCharArray(), c2 = magazine.toCharArray();
        for (char x : c1)
            list1.add(x);
        for (char x : c2)
            list2.add(x);
        for (char x : list1) {
            int index = list2.indexOf(x);
            if (index == -1)
                return false;
            list2.remove(index);
        }
        return true;

    }
}
