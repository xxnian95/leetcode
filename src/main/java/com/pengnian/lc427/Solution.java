package com.pengnian.lc427;

import org.junit.jupiter.api.Test;
import com.pengnian.quadtree.*;

/**
 * @author Zhang Pengnian
 * @date 2019-04-27 18:00
 */

class Solution {

    @Test
    void test() {
        int[][] grid = {
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}
        };
        Node node = construct(grid);
        System.out.println("pause");
    }

    private Node construct(int[][] grid) {
        int N = grid.length;
        Node node = new Node();
        node.isLeaf = true;

        mark:
        for (int[] x : grid) {
            for (int j = 0; j < N; j++) {
                if (x[j] != grid[0][0]) {
                    node.isLeaf = false;
                    break mark;
                }
            }
        }

        if (!node.isLeaf) {
            int[][] topLeft = new int[N / 2][N / 2], topRight = new int[N / 2][N / 2],
                    bottomLeft = new int[N / 2][N / 2], bottomRight = new int[N / 2][N / 2];
            for (int i = 0; i < N / 2; i++) {
                for (int j = 0; j < N / 2; j++) {
                    topLeft[i][j] = grid[i][j];
                }
            }
            for (int i = N / 2; i < N; i++) {
                for (int j = 0; j < N / 2; j++) {
                    bottomLeft[i - N / 2][j] = grid[i][j];
                }
            }
            for (int i = 0; i < N / 2; i++) {
                for (int j = N / 2; j < N; j++) {
                    topRight[i][j - N / 2] = grid[i][j];
                }
            }
            for (int i = N / 2; i < N ; i++) {
                for (int j = N / 2; j < N; j++) {
                    bottomRight[i - N / 2][j - N / 2] = grid[i][j];
                }
            }
            node.topLeft = construct(topLeft);
            node.topRight = construct(topRight);
            node.bottomLeft = construct(bottomLeft);
            node.bottomRight = construct(bottomRight);
        } else {
            node.val = grid[0][0] == 1;
        }
        return node;
    }


}
