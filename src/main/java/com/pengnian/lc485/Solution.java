package com.pengnian.lc485;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-05-23 19:10
 */
class Solution {

    @Test
    void test() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }

    private int findMaxConsecutiveOnes(int[] nums) {

        int maxConsecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int j = i;
                int count = 0;
                while (j < nums.length && nums[j] == 1) {
                    count++;
                    j++;
                }
                i = j - 1;
                if (count > maxConsecutiveOnes)
                    maxConsecutiveOnes = count;
            }
        }
        return maxConsecutiveOnes;

    }
}
