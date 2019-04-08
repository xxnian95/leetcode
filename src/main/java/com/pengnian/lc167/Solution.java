package com.pengnian.lc167;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-06 22:36
 * <p>
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 */
public class Solution {

    @Test
    public void test() {
        int[] numbers = {2, 7, 11, 15};
        int target = 27;
        int[] result = twoSum(numbers, target);
        if (result == null)
            System.out.println("null");
        else {
            for (int x : result) {
                System.out.println(x);
            }
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        int N = numbers.length;
        if (N < 2)
            return null;
        for (int i = 0; i < N - 1; i++) {
            if (numbers[i] > target)
                return null;
            for (int j = i + 1; j < N; j++) {
                if (numbers[i] + numbers[j] == target) {
                    int[] result = new int[2];
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return null;
    }
}
