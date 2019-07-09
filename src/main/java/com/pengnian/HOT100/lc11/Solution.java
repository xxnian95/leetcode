package com.pengnian.HOT100.lc11;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-07-09 17:09
 */
class Solution {

    @Test
    void test() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    private int maxArea(int[] height) {

        int i = 0;
        int area = 0;
        while (i < height.length) {
            int j = height.length - 1;
            while (j > i) {
                int currentArea = (j - i) * Math.min(height[i], height[j]);
                if (currentArea > area)
                    area = currentArea;
                j--;
            }
            i++;
        }
        return area;

    }
}
