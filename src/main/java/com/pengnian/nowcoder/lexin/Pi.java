package com.pengnian.nowcoder.lexin;

import java.util.Scanner;

/**
 * @author Zhang Pengnian
 * @since 2019-08-02 20:09
 */
public class Pi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String pi = "3.1415926535897932384626433832795028841971";
        print(pi, n);
    }

    /**
     *
     * @param pi 圆周率
     * @param n 保留小数点后n位
     */
    private static void print(String pi, int n) {
        String s = pi.substring(0, n + 3);
        char[] c = s.toCharArray();
        for (int i = 0; i < n + 1; i++) {
            System.out.print(c[i]);
        }
        if (c[n + 2] < '5') {
            System.out.print(c[n + 1]);
        } else {
            System.out.print(c[n + 1] + 1 - '0');
        }
    }

}
