package com.pengnian.lc198;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-08 17:10
 */
class Solution {

    private static int[] record;

    @Test
    void test() {
        int[] a = {1, 2, 3, 1};
        System.out.println(rob(a));
    }

    @Test
    void test2() {
        int[] a = {2, 7, 9, 3, 1};
        System.out.println(rob(a));
    }

    @Test
    void test3() {
        int[] a = {1, 2};
        System.out.println(rob(a));
    }

    @Test
    void test4() {
        int[] a = {226, 174, 214, 16, 218, 48, 153, 131, 128, 17, 157, 142, 88, 43, 37, 157, 43, 221, 191, 68, 206, 23, 225, 82, 54, 118, 111, 46, 80, 49, 245, 63, 25, 194, 72, 80, 143, 55, 209, 18, 55, 122, 65, 66, 177, 101, 63, 201, 172, 130, 103, 225, 142, 46, 86, 185, 62, 138, 212, 192, 125, 77, 223, 188, 99, 228, 90, 25, 193, 211, 84, 239, 119, 234, 85, 83, 123, 120, 131, 203, 219, 10, 82, 35, 120, 180, 249, 106, 37, 169, 225, 54, 103, 55, 166, 124};
        System.out.println(rob(a));
    }

    private int rob(int[] nums) {
        //  每一次小偷有两个选择，偷第一家或者第二家
        record = new int[nums.length];
        for (int i = 0; i < record.length; i++) {
            record[i] = -1;
        }
        return rob(nums, 0);
    }

    private int rob(int[] nums, int point) {
        //  point指向当前第一家可以偷的人家
        if (point >= record.length)
            return 0;
        if (record[point] == -1) {
            int res;
            if (point == nums.length - 1) {
                res = nums[point];
                record[point] = res;
                return res;

            } else if (point == nums.length - 2) {
                res = Math.max(nums[point], nums[point + 1]);
                record[point] = res;
                return res;

            } else {
                res = Math.max(nums[point] + rob(nums, point + 2), nums[point + 1] + rob(nums, point + 3));
                record[point] = res;
                return res;
            }
        } else {
            return record[point];
        }
    }
}
