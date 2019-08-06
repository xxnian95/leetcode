package com.pengnian.lc62;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author Zhang Pengnian
 * @since 2019-08-05 18:27
 */
class Solution {

    private HashMap<String, Integer> map = new HashMap<>();

    public int uniquePaths(int m, int n) {
        return uniquePaths(m, n, 0, 0);
    }

    private int uniquePaths(int m, int n, int i, int j) {
        if (i == n || j == m) {
            return 0;
        } else if (i == n - 1 && j == m - 1) {
            return 1;
        }
        String coordinate = i + " " + j;
        if (map.containsKey(coordinate)) {
            return map.get(coordinate);
        } else {
            int result;
            if (i == n - 1) {
                result = uniquePaths(m, n, i, j + 1);
            } else if (j == m - 1) {
                result = uniquePaths(m, n, i + 1, j);
            } else {
                result = uniquePaths(m, n, i + 1, j)
                        + uniquePaths(m, n, i, j + 1);
            }

            map.put(coordinate, result);
            return result;
        }
    }

    @Test
    void test() {
        System.out.println(uniquePaths(23, 12));
    }
}