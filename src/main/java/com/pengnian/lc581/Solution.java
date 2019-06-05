package com.pengnian.lc581;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Zhang Pengnian
 * @since 2019-06-05 21:40
 */
class Solution {

    @Test
    void test() {
        int[] a = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(a));
    }

    private int findUnsortedSubarray(int[] nums) {

        int[] original = nums.clone(), sorted = nums.clone();
        Arrays.sort(sorted);
        int lo = 0, hi = nums.length - 1;
        while (lo < nums.length && original[lo] == sorted[lo]) {
            lo++;
        }
        while (hi >= 0 && original[hi] == sorted[hi]) {
            hi--;
        }
        if (lo > hi)
            return 0;
        else
            return hi - lo + 1;

    }
}
