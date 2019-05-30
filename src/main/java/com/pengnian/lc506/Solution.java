package com.pengnian.lc506;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Zhang Pengnian
 * @since 2019-05-28 23:07
 */
class Solution {

    @Test
    void test() {
        int[] nums = {432,5,234,5,2345,23,45,35,2,42,235,3,45,234,2,345,35,4};
        for (String string : findRelativeRanks(nums))
            System.out.println(string);
    }

    private String[] findRelativeRanks(int[] nums) {

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        int rank = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = sortedNums.length - 1; i >= 0; i--) {
            map.put(sortedNums[i], rank++);
        }

        String[] result = new String[sortedNums.length];
        for (int i = 0; i < sortedNums.length; i++) {
            String current = map.get(nums[i]).toString();
            switch (current) {
                case "1":
                    current = "Gold Medal";
                    break;
                case "2":
                    current = "Silver Medal";
                    break;
                case "3":
                    current = "Bronze Medal";
                    break;
            }
            result[i] = current;
        }
        return result;
    }
}
