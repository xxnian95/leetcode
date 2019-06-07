package com.pengnian.lc633;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-06-07 15:12
 */
class Solution {

    @Test
    void test() {
        int c = 2147482647;
        System.out.println(judgeSquareSum(c));
    }

    private boolean judgeSquareSum(int c) {
        //  耗时太长
//        for (int i = 0; i <= c; i++) {
//            if (i * i > c)
//                break;
//            for (int j = i; j <= c; j++) {
//                if (i * i + j * j == c)
//                    return true;
//                else if (i * i + j * j > c) {
//                    break;
//                }
//            }
//        }
//        return false;

        int i = 0, j = (int) Math.sqrt(c);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == c)
                return true;
            else if (powSum > c)
                j--;
            else
                i++;
        }
        return false;
    }

}
