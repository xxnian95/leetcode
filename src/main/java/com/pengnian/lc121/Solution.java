package com.pengnian.lc121;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-07-04 20:54
 */
class Solution {

    @Test
    void test() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    private int maxProfit(int[] prices) {

        if (prices.length == 0)
            return 0;
        int currentMaxProfit = 0;
        int soFarMin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (soFarMin > prices[i])
                soFarMin = prices[i];
            else
                currentMaxProfit = Math.max(currentMaxProfit, prices[i] - soFarMin);
        }
        return currentMaxProfit;
    }
}
