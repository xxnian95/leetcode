package com.pengnian.nowcoder.netease;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Zhang Pengnian
 * @since 2019-08-03 16:20
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
            list.add(nums[i]);
        }
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        LinkedList<Integer> sortedList = new LinkedList<>();
        for (int x : sorted) {
            sortedList.add(x);
        }
        while(!sortedList.isEmpty()) {
            int a = sortedList.get(0);
            sortedList.remove(0);
            int index1 = list.indexOf(a);
        }
    }
}
