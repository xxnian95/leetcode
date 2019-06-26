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
        int[][] points = {{10, 16}, {2, 5}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));
    }


    private int findMinArrowShots(int[][] points) {

        if (points.length == 0)
            return 0;
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));    //  按照每组第二个元素的大小给数组排序
        int count = 1, end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= end) {
                continue;   //  对于这两个数组，较大的第一个数字小于较小的第二个数字，因此能够用一个飞镖
            }
            count++;
            end = points[i][1]; //  不能再用一个飞镖，因此end换为下一个数组的第二个数字
        }

        return count;
    }
}
