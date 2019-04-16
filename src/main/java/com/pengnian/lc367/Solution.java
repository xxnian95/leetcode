package com.pengnian.lc367;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-15 21:38
 */

/*
利用 1+3+5+7+9+…+(2n-1)=n^2，即完全平方数肯定是前n个连续奇数的和
 */
class Solution {

    @Test
    void test() {
        int num = 42;
        System.out.println(isPerfectSquare(num));
    }

    private boolean isPerfectSquare(int num) {

        if (num > 100000000) {
            int sum = 0;
            int d = 1;
            while (sum < num - d) {
                sum = sum + d;
                d = d + 2;
            }
            sum = sum + d;
            return sum == num;
        } else {
            int sum = 0;
            int d = 1;
            while (sum < num) {
                sum = sum + d;
                d = d + 2;
            }
            return sum == num;
        }
    }

}
