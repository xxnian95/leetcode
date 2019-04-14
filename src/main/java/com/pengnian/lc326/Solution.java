package com.pengnian.lc326;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-14 10:44
 */
class Solution {

    @Test
    void test() {
        int n = 81;
        System.out.println(isPowerOfThree(n));
    }

    private boolean isPowerOfThree(int n) {
//        int sum = 0;
//        while (n != 0) {
//            sum = sum + n % 10;
//            n = n / 10;
//        }
        if (n == 2 || n == 0)
            return false;
        while (n != 0 && n != 1) {
            if (n % 3 != 0)
                return false;
            n = n / 3;
        }
        return true;
    }
}
