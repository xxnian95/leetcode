package com.pengnian.lc492;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-05-23 19:45
 */
class Solution {

    @Test
    void test() {
        int area = 10005;
        for (int integer : constructRectangle(area))
            System.out.println(integer);
    }

    private int[] constructRectangle(int area) {

        int L, W;
        double root = Math.pow(area, 0.5);
        int floor = (int) root;
        W = floor;
        L = floor;
        while (true) {
            int product = W * L;
            if (product == area) {
                break;
            } else if (product < area) {
                L++;
            } else {
                L = floor;
                W--;
            }
        }
        System.gc();
        return new int[]{L, W};
    }

}
