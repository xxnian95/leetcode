package com.pengnian.lc225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zhang Pengnian
 * @date 2019-04-10 15:35
 */
class MyStack {

    private int p;
    private LinkedList<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        list = new LinkedList<>();
        p = -1;
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        p++;
        if (p == list.size())
            list.add(x);
        else
            list.set(p,x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {

        return list.get(p--);
    }

    /**
     * Get the top element.
     */
    public int top() {
        return list.get(p);
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return p == -1;
    }
}
