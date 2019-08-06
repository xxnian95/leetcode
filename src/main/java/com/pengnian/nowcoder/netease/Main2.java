package com.pengnian.nowcoder.netease;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Zhang Pengnian
 * @since 2019-08-03 15:53
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), q = in.nextInt();
        int[] nums = new int[n], asks = new int[q];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        for (int i = 0; i < q; i++) {
            asks[i] = in.nextInt();
        }
        // -------------------

        function2(nums, asks);


    }

    private static void function2(int[] nums, int[] asks) {
        for (int i = 0; i < asks.length; i++) {
            int j = 0, count = 0;
            while (j < nums.length && nums[j] <= asks[i] + i) {
                int result = asks.length - j + 1;
                System.out.println(result);
            }
        }

    }
}