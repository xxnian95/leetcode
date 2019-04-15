package com.pengnian.lc367;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-15 21:38
 */
class Solution {

    @Test
    void test() {
        long num = 2147483647;
        System.out.println(isPerfectSquare(num));
    }
//TODO 超时。。。
    private boolean isPerfectSquare(long num) {
        if(num==1)
            return true;
        for (long i = 2; i <= num / 2; i++) {
            long res = 1;
            while (res < num) {
                res = res * i;
            }
            if (res == num)
                return true;
        }
        return false;
    }

}
