package com.pengnian.nowcoder.netease;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Zhang Pengnian
 * @since 2019-08-03 16:28
 */
public class Main4 {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        List<List<Integer>> list = new LinkedList<>();
        while (q != 0) {
            q--;
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++ ) {
                nums[i] = in.nextInt();
            }
            print(nums);
        }
    }

    private static void print(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            boolean[] visited = new boolean[nums.length];
            result = result | print(nums, i, visited, new LinkedList<>());
        }
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean print(int[] nums, int i, boolean[] visited,
                              LinkedList<Integer> list) {

        visited[i] = true;
        list.add(nums[i]);
        if (list.size() != nums.length) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (!visited[j]) {
                    print(nums, j, visited, list);
                }
            }
            return false;
        } else {
            int[] last = new int[list.size()];
            for (int j = 0; j < last.length; j++) {
                last[i] = list.get(0);
            }
            boolean result = true;
            for (int j = 0; j < last.length; j++) {
                if (j == 0) {
                    if (last[j + 1] + last[last.length - 1] <= last[j]) {
                        result = false;
                        break;
                    }
                }
            }
            return result;
        }
    }
}
