package com.pengnian.lc53;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-07-04 19:42
 */
class Solution {

    @Test
    void test() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    private int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int preSum = nums[0], currentSum = preSum;
        for (int i = 1; i < nums.length; i++) {
            preSum = preSum > 0 ? preSum + nums[i] : nums[i];   //  preSum大于零就可以保留，否则重置为当前元素
            currentSum = Math.max(currentSum, preSum);
        }
        return currentSum;
    }

}
