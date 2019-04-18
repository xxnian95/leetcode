package com.pengnian.lc70;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-16 10:58
 */
class Solution {


    private static int[] record;
    private static boolean firstRunFlag = true;

    @Test
    void test() {
        int n = -1;
        System.out.println(climbStairs(n));
    }

    private int climbStairs(int n) {

        if (firstRunFlag) {
            firstRunFlag = false;
            record = new int[n + 1];
            for (int i = 0; i <= n; i++)
                record[i] = -1;
        }
        if(n<0)
            return 0;
        if (record[n] == -1) {
            if (n == 0)
                record[n] = 0;
            else if (n == 1)
                record[n] = 1;
            else if (n == 2)
                record[n] = 2;
            else
                record[n] = climbStairs(n - 1) + climbStairs(n - 2);
        }
        return record[n];
    }
}
