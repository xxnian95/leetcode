package com.pengnian.nowcoder.netease;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 网易2019校招提前批
 * @author Zhang Pengnian
 * @since 2019-08-03 14:45
 */
public class Main1 {

    private static HashMap<Integer, Double> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] b = a.clone();
        Arrays.sort(b);
        LinkedList<Integer> list = new LinkedList<>();
        for (int x : b) {
            list.add(x);
        }
        int q = in.nextInt();
        int[] ask = new int[q];
        for (int i = 0; i < q; i++) {
            ask[i] = in.nextInt();
        }
        for (int i = 0; i < q; i++) {
            cal(a, ask[i], list);
        }
    }

    private static void cal(int[] a, int x, LinkedList<Integer> list) {
        Double result;
        if (map.containsKey(x)) {
            result = map.get(x);
        } else {
            int index = list.lastIndexOf(a[x - 1]);
            result = index * 1.0d / a.length;
            map.put(x, result);
        }
        result = result * 100;
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(result));

    }
}