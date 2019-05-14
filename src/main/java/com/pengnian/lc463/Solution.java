package com.pengnian.lc463;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-05-14 20:35
 */
class Solution {

    @Test
    void test() {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(islandPerimeter(grid));
    }

    private int islandPerimeter(int[][] grid) {
        int length = 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    //  top
                    if (i - 1 < 0)
                        length++;
                    else if (grid[i - 1][j] == 0)
                        length++;

                    //  bottom
                    if (i + 1 > m - 1)
                        length++;
                    else if (grid[i + 1][j] == 0)
                        length++;

                    //  left
                    if (j - 1 < 0)
                        length++;
                    else if (grid[i][j - 1] == 0)
                        length++;

                    //  right
                    if (j + 1 > n - 1)
                        length++;
                    else if (grid[i][j + 1] == 0)
                        length++;
                }
            }
        }
        return length;
    }
}
