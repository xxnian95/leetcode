package com.pengnian.lc64;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author Zhang Pengnian
 * @since 2019-08-06 16:05
 */
class Solution {

    private HashMap<String, Integer> map = new HashMap<>();

    @Test
    void test() {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.println(minPathSum(grid));
    }

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        return minPathSum(grid, 0, 0, 0);
    }

    private int minPathSum(int[][] grid, int i, int j, int preSum) {
        if (i == grid.length || j == grid[0].length) {
            return Integer.MAX_VALUE;
        }
        int currentSum = preSum + grid[i][j];
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return currentSum;
        }
        String str = i + " " + j;
        if (map.containsKey(str)) {
            return map.get(str) + currentSum;
        }
        int nextSum = Math.min(minPathSum(grid, i + 1, j, currentSum),
                minPathSum(grid, i, j + 1, currentSum));
        map.put(str, nextSum);
        return nextSum;
    }
}