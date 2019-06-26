package com.pengnian.lc406;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-06-26 14:49
 */
class Solution {

    @Test
    void test() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] sorted = reconstructQueue(people);
        for (int[] x : sorted) {
            System.out.println(x[0] + ", " + x[1]);
        }
    }

    private int[][] reconstructQueue(int[][] people) {

        if (people == null || people.length == 0 || people[0].length == 0)
            return new int[0][0];
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        /*  sort的第二个参数是一个Comparator。
        如果身高相同，将第二个数字比较小的元素放在前面。
        如果身高不同，将身高较大的元素放在前面。
         */
        List<int[]> queue = new ArrayList<>();
        for (int[] p : people) {
            queue.add(p[1], p); //  这他妈神操作啊
        }
        return queue.toArray(new int[queue.size()][]);  //  这一步我也不知道是怎么回事。。。

    }
}
