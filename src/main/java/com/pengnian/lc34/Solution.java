package com.pengnian.lc34;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-12 13:08
 */
class Solution {

    @Test
    void test() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    @Test
    void test2() {
        int[] nums = {};
        int target = 7;
        int[] result = searchRange(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    @Test
    void test3() {
        int[] nums = {1, 3};
        int target = 1;
        int[] result = searchRange(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    @Test
    void test4() {
        int[] nums = {1, 4};
        int target = 4;
        int[] result = searchRange(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    private int[] searchRange(int[] nums, int target) {

        int N = nums.length;


        int[] result = {-1, -1};
        int left = 0, right = N - 1;
        int mid = 0;
        if (N == 0)
            return result;
        if (N == 1) {
            if (nums[0] == target) {
                result[0] = 0;
                result[1] = 0;
            }
            return result;
        }
        if (nums[0] > target || nums[N - 1] < target)
            return result;
        while (true) {
            if (left == right - 1 && nums[left] < target && nums[right] > target)
                //  数组中不含target
                return result;
            if (nums[left] == target)
                mid = left;
            else if (nums[right] == target)
                mid = right;
            else
                mid = (left + right) / 2;

            if (nums[mid] > target) {
                //  target位于mid左侧
                right = mid;
            } else if (nums[mid] < target) {
                //  target位于mid右侧
                left = mid;
            } else {
                //  找到target，开始找起始和结束的位置
                left = mid;
                right = mid;

                while (left >= 0 && nums[left] == target)
                    left--;
                left++;

                while (right < N && nums[right] == target)
                    right++;
                right--;

                result[0] = left;
                result[1] = right;
                return result;
            }

        }



    }
}
