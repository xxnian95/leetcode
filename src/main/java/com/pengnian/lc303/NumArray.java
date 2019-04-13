package com.pengnian.lc303;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-13 14:56
 */
class NumArray {

    public int[] nums;
    private int[] sum;

    public NumArray(int[] nums) {
        this.nums = nums;
        sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                sum[i] = nums[i];
            else
                sum[i] = nums[i] + sum[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        if(i==0)
            return sum[j];
        return sum[j]-sum[i]+nums[i];
    }
}
