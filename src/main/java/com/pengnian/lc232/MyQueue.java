package com.pengnian.lc232;

import java.util.LinkedList;

/**
 * @author Zhang Pengnian
 * @date 2019-04-10 16:54
 */
class MyQueue {

    private int head, tail;
    private LinkedList<Integer> list = new LinkedList<>();

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        head = -1;
        tail = -1;
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        tail++;
        list.add(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        head++;
        return list.get(head);
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return list.get(head + 1);
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return head==tail;
    }




}