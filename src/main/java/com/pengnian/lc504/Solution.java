package com.pengnian.lc504;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Zhang Pengnian
 * @since 2019-05-26 23:58
 */
class Solution {

    @Test
    void test() {
        int num = 0;
        System.out.println(convertToBase7(num));
    }

    private String convertToBase7(int num) {

        boolean numIsNegative = num < 0;
        num = Math.abs(num);
        if(num == 0)
            return "0";
        StringBuilder base7 = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            stack.push(num % 7);
            num = num / 7;
        }
        if (numIsNegative)
            base7.append('-');
        while (!stack.isEmpty()) {
            base7.append(stack.pop());
        }
        return base7.toString();
    }
}
