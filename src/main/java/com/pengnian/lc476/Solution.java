package com.pengnian.lc476;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-05-15 22:18
 */
class Solution {

    @Test
    void test() {
        int num = 1;
        System.out.println(findComplement(num));
    }

    private int findComplement(int num) {

        int result = 0;

        int digit = 0;
        while (Math.pow(2, digit) <= num)
            digit++;

        int[] hex = new int[digit];
        int i = 0;
        while (num != 0) {
            hex[i] = num % 2;
            num = num / 2;
            i++;
        }

        for (i = 0; i < digit; i++) {
//            hex[i] = 1 - hex[i];
            int tmp = 0;
            if (hex[i] == 0) {
                tmp = (int) Math.pow(2, i);
            }
            result = result + tmp;
        }

        return result;
    }
}
