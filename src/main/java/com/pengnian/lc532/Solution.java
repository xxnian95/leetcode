package com.pengnian.lc532;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Zhang Pengnian
 * @since 2019-05-30 17:30
 */
class Solution {

    @Test
    void test() {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        System.out.println(findPairs(nums, k));
    }

    @Test
    void test2() {
        int[] nums = {1, 1, 1, 1, 1};
        int k = 0;
        System.out.println(findPairs(nums, k));
    }

    //  FIXME   难以处理k=0以及多个重复元素的情况
    private int findPairs(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        for (int integer : nums) {
            set.add(integer);
        }
        if (k == 0) {
            return nums.length - set.size();
        }
        HashSet<Integer[]> kDiff = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>(set);
        for (int integer : list) {
            if (list.contains(integer + k)) {
                Integer[] findOne = new Integer[2];
                findOne[0] = integer;
                findOne[1] = integer + k;
                kDiff.add(findOne);
            }
            if (list.contains(integer - k)) {
                Integer[] findOne = new Integer[2];
                findOne[0] = integer - k;
                findOne[1] = integer;
                kDiff.add(findOne);
            }
        }
        return kDiff.size() / 2;

    }
}
