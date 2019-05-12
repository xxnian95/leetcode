package com.pengnian.lc448;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-05-12 15:06
 */
class Solution {

    @Test
    void test() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = findDisappearedNumbers(nums);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    private List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            //  将所有元素-1，范围变为0~n-1，输出前要全部再加上
            nums[i] = nums[i] - 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                while (nums[nums[i]] != nums[i]) {
                    //  下一个元素的下标和值不相等
                    exchange(nums, i, nums[i]);
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i])
                result.add(i + 1);
        }
        return result;

    }

    private void exchange(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
