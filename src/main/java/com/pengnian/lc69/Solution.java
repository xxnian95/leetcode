package com.pengnian.lc69;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-07-07 22:39
 */
class Solution {

    @Test
    void test() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + ", " + mySqrt(i));
        }
    }

    @Test
    void test2() {
        int n = 2147395599;
        System.out.println(mySqrt(n));
    }

    private int mySqrt(int x) {

        if (x == 0)
            return 0;
        int low = 1, high = x;
        while (true) {
            int mid = low + (high - low) / 2;
            if ((long) mid * (long) mid <= (long) x && ((long) mid + 1) * ((long) mid + 1) > (long) x)
                return mid;
            else if ((long)mid * (long)mid < x)
                low = mid;
            else
                high = mid;
        }
    }


}
