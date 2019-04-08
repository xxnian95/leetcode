package com.pengnian.lc198;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-08 17:10
 */
public class Solution {

    @Test
    void test() {
        int[] a = {1, 2, 3, 1};
        System.out.println(rob(a));
    }

    @Test
    void test2() {
        int[] a = {2, 7, 9, 3, 1};
        System.out.println(rob(a));
    }

    private int rob(int[] nums) {
        int N = nums.length;
        int max = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 2; j < N; j++) {
                if (nums[i] + nums[j] > max)
                    max = nums[i] + nums[j];
            }
        }
        return max;
        //TODO 可以偷多次，而不是仅仅两次
    }
}
