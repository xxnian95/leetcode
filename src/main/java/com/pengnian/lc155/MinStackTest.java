package com.pengnian.lc155;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-05 22:11
 */
class MinStackTest {

    @Test
    public void test() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

}
