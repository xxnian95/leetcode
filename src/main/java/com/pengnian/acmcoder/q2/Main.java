package com.pengnian.acmcoder.q2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * https://exercise.acmcoder.com/online/online_judge_ques?ques_id=3374&konwledgeId=41
 * 京东2017秋招真题
 *
 * @author Zhang Pengnian
 * @since 2019-08-06 17:25
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String currentLine = bf.readLine();
//        List<String> results = new LinkedList<>();
//        while (currentLine != null && currentLine.length() != 0) {
//            String[] line1 = currentLine.split(" ");
//            int m = Integer.parseInt(line1[0]), n = Integer.parseInt(line1[1]);
//            currentLine = bf.readLine();
//            String[] line2 = currentLine.split(" ");
//            currentLine = bf.readLine();
//            String[] line3 = currentLine.split(" ");
//            int[] a = new int[m], b = new int[n];
//            for (int i = 0; i < m; i++) {
//                a[i] = Integer.parseInt(line2[i]);
//            }
//            for (int i = 0; i < n; i++) {
//                b[i] = Integer.parseInt(line3[i]);
//            }
//            currentLine = bf.readLine();
//            String result = merge(a, b);
//            results.add(result);
//        }
//        for (String s : results) {
//            System.out.println(s);
//        }

        // 第二种方法
        Scanner sc = new Scanner(System.in);
        List<String> results = new LinkedList<>();
        while (sc.hasNextInt()) {
            int m = sc.nextInt(), n = sc.nextInt();
            int[] a = new int[m], b = new int[n];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            results.add(merge(a,b));
        }
        for (String s : results) {
            System.out.println(s);
        }
    }

    private static String merge(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        int last = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();
        while (i < a.length || j < b.length) {
            int print;
            if (j == b.length) {
                print = a[i++];
            } else if (i == a.length) {
                print = b[j++];
            } else if (a[i] < b[j]) {
                print = a[i++];
            } else {
                print = b[j++];
            }
            if (last != print) {
                last = print;
                sb.append(print);
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}