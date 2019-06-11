package com.pengnian.lc215;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Zhang Pengnian
 * @since 2019-06-11 23:37
 */
class Solution {

    @Test
    void test() {
        int[] nums = {3,2,5,4,1};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }

    private int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length - k];

    }
}
