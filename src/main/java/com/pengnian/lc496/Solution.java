package com.pengnian.lc496;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Zhang Pengnian
 * @since 2019-05-24 22:31
 */
class Solution {

    @Test
    void test() {
        int[] nums1 = {4, 1, 2}, nums2 = {1, 3, 4, 2};
        for (int integer : nextGreaterElement(nums1, nums2)) {
            System.out.println(integer);
        }
    }

    @Test
    void test2() {
        int[] nums1 = {2, 4}, nums2 = {1, 2, 3, 4};
        for (int integer : nextGreaterElement(nums1, nums2)) {
            System.out.println(integer);
        }
    }

    private int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int integer : nums2) {
            list.add(integer);
        }

        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            for (int j = list.indexOf(current); j < nums2.length; j++) {
                if (nums2[j] > current) {
                    result[i] = nums2[j];
                    break;
                }
            }
        }
        return result;

    }
}
