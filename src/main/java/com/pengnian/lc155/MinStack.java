package com.pengnian.lc155;

import java.util.LinkedList;

/**
 * @author Zhang Pengnian
 * @date 2019-04-05 22:04
 */
public class MinStack {

    private LinkedList<Integer> stack = new LinkedList<>();


    public MinStack() {
    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.getFirst();
    }

    public int getMin() {
        if(stack.size()==0)
            return 0;
        int min = stack.get(0);
        for(int x:stack){
            if(x<min)
                min = x;
        }
        return min;
    }
}
