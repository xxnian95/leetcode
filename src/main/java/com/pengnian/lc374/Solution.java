package com.pengnian.lc374;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-17 17:26
 */
class Solution {

    @Test
    void test() {
        int n = 2147483647;
        System.out.println(guessNumber(n));
    }

    private int guessNumber(int n) {
        while (true) {
            int res = guess(n);
            if (res < 0)
                n = n - 1;
            else if (res > 0)
                n = n + 1;
            else
                return n;
        }
    }

    private int guess(int num) {
        int pick = 2147483647;
        return Integer.compare(pick, num);
    }
}
