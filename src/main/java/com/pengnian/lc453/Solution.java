package com.pengnian.lc453;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Zhang Pengnian
 * @since 2019-05-12 15:14
 */
class Solution {

    @Test
    void test() {
        int[] nums = {1, 2, 3, 5, 4, 3, 2, 3, 4, 5, 4, 3, 7, 6, 5, 4, 5};
        System.out.println(minMoves(nums));
    }

    @Test
    void test2() {
        int[] nums = {1, 2147483647};
        System.out.println(minMoves(nums));
    }

    @Test
    void test3() {
        int[] nums = {1, 2, 3};
        System.out.println(minMoves(nums));
    }

    private int minMoves(int[] nums) {
        //  运行时间过长
//        int count = 0, N = nums.length;
//        Arrays.sort(nums);
//        while (nums[0] != nums[N - 1]) {
//            nums[N - 1]--;
//            Arrays.sort(nums);
//            count++;
//        }
//        return count;


        Arrays.sort(nums);
        int result = 0, N = nums.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + nums[i];
        }
        result = sum - nums[0] * N;
        return result;
    }
}
