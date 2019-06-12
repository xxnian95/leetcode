package com.pengnian.lc347;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-06-12 22:03
 */
class Solution {

    @Test
    void test() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        for (Integer integer : topKFrequent(nums, k)) {
            System.out.println(integer);
        }
    }

    private List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();
        List<Integer> checkedNums = new ArrayList<>();
        List<List<Integer>> buckets = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            buckets.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < nums.length; i++) {
            if (!checkedNums.contains(nums[i])) {
                checkedNums.add(nums[i]);
                int count = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == nums[i])
                        count++;
                }
                buckets.get(count).add(nums[i]);    //  count+1为这个数字出现的次数，不过这个好像并不影响结果
            }
        }
        int i = nums.length - 1;
        while (k > 0) {
            if (!buckets.get(i).isEmpty()) {
                result.addAll(buckets.get(i));
                k = k - buckets.get(i).size();
            }
            i--;
        }
        return result;

    }
}
