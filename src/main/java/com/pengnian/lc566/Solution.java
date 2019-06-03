package com.pengnian.lc566;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-06-03 17:43
 */
class Solution {

    @Test
    void test() {
        int[][] nums = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        int[][] result = matrixReshape(nums, r, c);
        System.out.println("Pause");
    }

    private int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c)
            return nums;
        int i = 0;
        int[][] result = new int[r][c];
        while (i < m * n) {
            result[i / c][i % c] = nums[i / n][i % n];
            i++;
        }
        return result;
    }
}
