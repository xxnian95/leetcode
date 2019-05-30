package com.pengnian.lc507;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 * @author Zhang Pengnian
 * @since 2019-05-30 14:38
 */
class Solution {

    @Test
    void test() {
        int num = 28;
        System.out.println(checkPerfectNumber(num));
    }

    @Test
    void test2() {
        int num = 110503;
        System.out.println(checkPerfectNumber(num));
    }

    //  FIXME   耗时太久
    private boolean checkPerfectNumber(int num) {

        HashSet<Integer> divisor = new HashSet<>();
        divisor.add(1);
        int biggestDivisor = num / 2;
        for (int i = 2; i < num / 2; i++) {
            for (int j = biggestDivisor; j >= i && i * j >= num; j--) {
                if (i * j == num) {
                    divisor.add(i);
                    divisor.add(j);
                    biggestDivisor = j - 1;
                    break;
                }
            }
        }
        int sum = 0;
        for (int integer : divisor) {
            sum = sum + integer;
        }
        return sum == num;

    }

}
