package com.pengnian.lc75;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-06-13 23:12
 */
class Solution {

    @Test
    void test() {
        int[] nums = {2, 0, 2, 1, 1, 0, 2, 1};
        sortColors(nums);
        for (int x : nums) {
            System.out.println(x);
        }
    }

    /*
    三指针法：
    -如果遇到0，则放到数组的前端。
    -如果遇到2，则放到数组的后端。
    -如果遇到1，指向后一个元素。
     */
    private void sortColors(int[] nums) {

        int zero = 0, one = 0, two = nums.length - 1;
        while (one <= two) {
            if (nums[one] == 0) {
                swap(nums, one, zero);
                zero++;
                one++;
            } else if (nums[one] == 2) {
                swap(nums, one, two);
                two--;
            } else {
                one++;
            }
        }

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
