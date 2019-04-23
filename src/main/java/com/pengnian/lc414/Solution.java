package com.pengnian.lc414;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

/**
 * @author Zhang Pengnian
 * @date 2019-04-23 20:23
 */
class Solution {

    @Test
    void test() {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }

    @Test
    void test2() {
        int[] nums = {2, 1, 4, 5, 42, 34, 5, 4, 324, 5, 2, 54, 35, 43, 2, 5};
        System.out.println(thirdMax(nums));
    }

    @Test
    void test3() {
        int[] nums = {1, 2, -2147483648};
        System.out.println(thirdMax(nums));
    }

    @Test
    void test4() {
        int[] nums ={-2147483648, -2147483648, -2147483648, -2147483648, 1, 1, 1};
        System.out.println(thirdMax(nums));
    }

    private int thirdMax(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        } else if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        else {
            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
            int count = 0;
            boolean thereIsAMinValue = false;
            for (int x : nums) {
                if (x == max1 || x == max2 || x == max3) {
                    if (x == Integer.MIN_VALUE && count <= 2 && !thereIsAMinValue) {
                        count++;
                        thereIsAMinValue = true;
                    }
                    continue;
                }
                if (x > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = x;
                    count++;
                } else if (x > max2) {
                    max3 = max2;
                    max2 = x;
                    count++;
                } else if (x > max3) {
                    max3 = x;
                    count++;
                }
            }
            if (count >= 3)
                return max3;
            else
                return max1;
        }
    }
}
