package com.pengnian.lc561;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Zhang Pengnian
 * @since 2019-06-03 16:57
 */
class Solution {

    @Test
    void test() {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }

    private int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length / 2, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i * 2];
        }
        return sum;
    }
}
