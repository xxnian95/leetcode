package com.pengnian.lc342;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-14 11:09
 */
class Solution {

    @Test
    void test() {
        int num = -2147483648;
        System.out.println(isPowerOfFour(num));
    }

    @Test
    void test2() {
        int num = -64;
        System.out.println(isPowerOfFour(num));
    }

    private boolean isPowerOfFour(int num) {

        if(num<=0)
            return false;
        while (num != 1 ) {
            if (num % 4 != 0)
                return false;
            num = num / 4;

        }
        return true;
    }

}
