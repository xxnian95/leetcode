package com.pengnian.lc283;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-12 15:15
 */
class Solution {

    @Test
    void test() {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        for (int x : nums)
            System.out.println(x);
    }

    @Test
    void test2() {
        int[] nums = {0,1};
        moveZeros(nums);
        for (int x : nums)
            System.out.println(x);
    }

    private void moveZeros(int[] nums) {

        int N = nums.length;
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                count++;
                for (int j = i; j < N - count; j++) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
    }
}
