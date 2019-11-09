package com.pengnian.HOT100.lc55;

/**
 * @author Zhang Pengnian
 * @since 2019-11-09 13:33
 */
public class Solution {

    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i]) {
                int currentStep = nums[i];
                for (int j = i; j <= i + currentStep && j < nums.length; j++) {
                    dp[j] = true;
                }
            }
        }
        return dp[dp.length - 1];
    }

}
