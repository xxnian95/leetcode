package com.pengnian.lc434;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-30 17:24
 */
class Solution {

    @Test
    void test() {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }

    private int countSegments(String s) {
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                int j = i + 1;
                while (j < c.length && c[j] != ' ') {
                    j++;
                }
                count++;
                i = j;
            }
        }
        return count;
    }
}
