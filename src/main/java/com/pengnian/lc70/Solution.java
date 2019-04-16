package com.pengnian.lc70;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-16 10:58
 */
class Solution {

    @Test
    void test() {
        int n = 3;
        System.out.println(climbStairs(n));
    }

    //FIXME 能运行，但是重复计算太多，时间超出限制
    private int climbStairs(int n) {

        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
