package com.pengnian.lc122;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-05 21:25
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 */
public class Solution {

    @Test
    void test() {
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit2(a));
    }

    @Test
    void test2() {
        int[] a = {1, 1, 0};
        System.out.println(maxProfit2(a));
    }

    @Test
    void test3() {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(maxProfit2(a));
    }

    private static int maxProfit(int[] prices) {
        int N = prices.length;
        if (N == 0 || N == 1)
            return 0;
        int sum = 0;
        int[] d = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            if (prices[i] > prices[i + 1])
                d[i] = -1; // 递减
            else if (prices[i] <= prices[i + 1])
                d[i] = 1; // 递增
        }
        int i = 0;
        while (i < N - 1) {
            if (d[i] == 1) {
                int j = i + 1;
                while (j < N - 1 && d[j] == 1)
                    j++;
                sum = sum + (prices[j] - prices[i]);
                i = j + 1;
            } else
                i++;
        }
        return sum;

    }

    private static int maxProfit2(int[] prices) {

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;

    }
}
