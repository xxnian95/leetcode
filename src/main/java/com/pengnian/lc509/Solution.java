package com.pengnian.lc509;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author Zhang Pengnian
 * @since 2019-05-30 15:15
 */
class Solution {

    static HashMap<Integer, Integer> map = new HashMap<>();

    static {
        map.put(0, 0);
        map.put(1, 1);
    }

    @Test
    void test() {
        int N = 4;
        System.out.println(fib(N));
    }

    private int fib(int N) {
        if (map.containsKey(N))
            return map.get(N);
        else {
            int tmp = fib(N - 1) + fib(N - 2);
            map.put(N, tmp);
            return tmp;
        }
    }
}
