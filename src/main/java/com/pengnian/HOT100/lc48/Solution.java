package com.pengnian.HOT100.lc48;

/**
 * @author Zhang Pengnian
 * @since 2019-11-05 14:45
 */
public class Solution {

    public void rotate(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int n = matrix.length;
        int layer = 0;
        while (layer < n) {

            for (int i = layer; i < n - layer - 1; i++) {
                int temp = matrix[layer][i];
                matrix[layer][i] = matrix[n - i - 1][layer];
                matrix[n - i - 1][layer] =
                        matrix[n - layer - 1][n - i - 1];
                matrix[n - layer - 1][n - i - 1] =
                        matrix[i][n - layer - 1];
                matrix[i][n - layer - 1] = temp;
            }

            layer++;
        }

    }

}
