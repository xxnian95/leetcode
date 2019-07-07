package com.pengnian.HOT100.lc1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-07-08 00:27
 */
class Solution {

    @Test
    void test() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        for (int x : twoSum(nums, target))
            System.out.println(x);
    }

    private int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        List<Integer> list = new LinkedList<>();
        Arrays.sort(nums);
        for (int x : nums)
            list.add(x);
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int another = target - current;
            int anotherIndex = list.indexOf(another);
            if (anotherIndex > -1 && anotherIndex != i) {
                result[0] = i;
                result[1] = list.indexOf(another);
                break;
            }
        }
        return result;

    }
}
