package com.pengnian.lc447;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author Zhang Pengnian
 * @since 2019-05-12 13:03
 */
class Solution {

    @Test
    void test() {
        int[][] points = {{0, 0}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        System.out.println(numberOfBoomerangs(points));
    }

    //  FIXME   根据题目要求，不仅要两组两点距离相同，还要其中有一个「公共点」
    private int numberOfBoomerangs(int[][] points) {
        int N = points.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int d = distance(points[i], points[j]);
                if (map.get(d) == null) {
                    //  First time this distance appears
                    map.put(d, 1);
                } else {
                    //  There is already a same distance in map
                    map.put(d, map.get(d) + 1);
                }
            }
        }
        int count = 0;
        for (Integer key : map.keySet()) {
            int num = map.get(key);
            if (num != 1) {
                count = count + nCk(num, 2);    //  好像不用这么复杂啊。。。n是固定的
            }
        }
        return count;
    }

    private int distance(int[] a, int[] b) {
        //  计算两点a、b之间欧拉距离的平方
        int x1 = a[0], y1 = a[1];
        int x2 = b[0], y2 = b[1];
        return (int) Math.pow(x1 - x2, 2) + (int) Math.pow(y1 - y2, 2);
    }

    private int nCk(int n, int k) {
        //  概率的cNk公式
        //  n是下标，k是上标
        int denominator = 1, numerator = 1;
        for (int i = 0; i < k; i++) {
            denominator = denominator * n;
            n--;
        }
        for (int i = 0; i < k; i++) {
            numerator = numerator * (i + 1);
        }
        return denominator / numerator;
    }
}
