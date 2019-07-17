package com.pengnian.HOT100.lc33;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-07-15 20:55
 */
class Solution {

    @Test
    void test() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    private int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (target < nums[mid]) {
                l = mid + 1;
            } else if (target > nums[mid]) {
                h = mid - 1;
            } else
                return mid;
        }
        return -1;
    }
}
