package com.pengnian.lc225;

import org.junit.jupiter.api.Test;

import static com.sun.tools.javac.jvm.ByteCodes.pop;

/**
 * @author Zhang Pengnian
 * @date 2019-04-10 15:39
 */
class MyStackTest {

    @Test
    void test() {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }

    @Test
    void test2() {
        MyStack stack = new MyStack();
        stack.push(1);
        System.out.println(stack.pop());
        stack.push(2);
        System.out.println(stack.pop());
    }
}
