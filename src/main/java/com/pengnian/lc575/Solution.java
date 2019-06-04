package com.pengnian.lc575;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 * @author Zhang Pengnian
 * @since 2019-06-04 20:50
 */
class Solution {

    @Test
    void test() {
        int[] candies = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(candies));
    }

    private int distributeCandies(int[] candies) {

        HashSet<Integer> set = new HashSet<>();
        for (int integer : candies) {
            set.add(integer);
        }
        if (set.size() <= candies.length / 2) {
            return set.size();
        } else {
            return candies.length / 2;
        }
    }
}
