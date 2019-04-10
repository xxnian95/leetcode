package com.pengnian.lc232;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-10 16:55
 */
class MyQueeTest {

    @Test
    void test() {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // 返回 1
        System.out.println(queue.pop());   // 返回 1
        System.out.println(queue.empty()); // 返回 false
    }
}
