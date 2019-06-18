package com.pengnian.lc452;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Zhang Pengnian
 * @since 2019-06-16 17:26
 */
class Solution {

    @Test
    void test() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));
    }

    //  FIXME
    private int findMinArrowShots(int[][] points) {

        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));

        return 0;
    }
}
