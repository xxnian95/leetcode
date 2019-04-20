package com.pengnian.lc400;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author Zhang Pengnian
 * @date 2019-04-20 13:16
 */
class Solution {

    @Test
    void test() {
//        for (int n = 1; n < 20; n++)
        int n = 2147483647;
        System.out.println(findNthDigit(n));
    }

    private int findNthDigit(int n) {
        long count = 0;
        int a = 0;
        while (count < n) {
            a++;
            int digit = 0;
            int currentNumber = a;
            while (currentNumber != 0) {
                currentNumber = currentNumber / 10;
                digit = digit + 1;
            }
            count = count + digit;
        }
        count = count - n;
        ArrayList<Integer> list = new ArrayList<>();
        while (a != 0) {
            list.add(a % 10);
            a = a / 10;
        }
        return list.get(count);
    }
}
