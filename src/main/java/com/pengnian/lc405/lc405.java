package com.pengnian.lc405;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author Zhang Pengnian
 * @date 2019-04-21 18:08
 */
class lc405 {

    @Test
    void test() {
        int num = -1;
        System.out.println(toHex(num));
    }

    //  FIXME 没有考虑负数
    private String toHex(int num) {

        ArrayList<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add(0, num % 16);
            num = num / 16;
        }
        String result = "";
        for (int x : list) {
            if (x > 9) {
                switch (x) {
                    case 10:
                        result = result + "a";
                        break;
                    case 11:
                        result = result + "b";
                        break;
                    case 12:
                        result = result + "c";
                        break;
                    case 13:
                        result = result + "d";
                        break;
                    case 14:
                        result = result + "e";
                        break;
                    case 15:
                        result = result + "f";
                        break;
                }
            } else {
                result = result + x;
            }
        }
        return result;
    }
}
