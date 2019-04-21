package com.pengnian.lc400;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @author Zhang Pengnian
 * @date 2019-04-20 13:16
 */
class Solution {

    @Test
    void test1() {
        int n = 11;
        System.out.println(findNthDigit(n));
    }

    @Test
    void test2() {
        int n = 1000000000;
        System.out.println(findNthDigit(n));
    }

    @Test
    void test3() {
        int n = 2147483647;
        System.out.println(findNthDigit(n));
    }

    @Test
    void test4() {
        for (int i = 1; i < 20; i++) {
            System.out.println(findNthDigit(i));
        }
    }
    // FIXME 超时
    private int findNthDigit(int n) {
        int currentNum = 0;
        Stack<Integer> stack = new Stack<>();
        while (true) {
            currentNum++;
            System.out.println(n);
            int tmp = currentNum;
            while (tmp != 0) {
                stack.add(tmp % 10);
                tmp = tmp / 10;
            }
            while (!stack.isEmpty()) {
                n--;
                int lastPushed = stack.pop();
                if (n == 0)
                    return lastPushed;
            }
        }
    }
}
