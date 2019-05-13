package com.pengnian.lc461;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-05-13 22:31
 */
class Solution {

    @Test
    void test() {
        int x = 4, y = 1;
        System.out.println(hammingDistance(x, y));
    }

    private int hammingDistance(int x, int y) {

        int count = 0;
        for (int i = 0; i < 31; i++) {
            if(x%2 != y%2)
                count++;
            x = x / 2;
            y = y / 2;
        }

        return count;
    }
}
