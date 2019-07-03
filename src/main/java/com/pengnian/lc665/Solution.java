package com.pengnian.lc665;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Zhang Pengnian
 * @since 2019-07-02 15:03
 */
class Solution {

    @Test
    void test() {
        int[] nums = {4, 2, 3, 4};
        System.out.println(checkPossibility(nums));
    }

    private boolean checkPossibility(int[] nums) {

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1])
                continue;
            else {
                count++;
                if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i - 1] = nums[i];
                }
            }
        }
        return count <= 1;

    }

}
