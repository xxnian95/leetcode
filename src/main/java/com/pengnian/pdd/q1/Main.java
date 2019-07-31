package com.pengnian.pdd.q1;

import java.io.IOException;
import java.util.Arrays;


/**
 * @author Zhang Pengnian
 * @since 2019-07-28 14:55
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String line1Array = "1 6 5 6 10", line2Array = "6 1 2 5 3";
        String[] line1 = line1Array.split(" "), line2 = line2Array.split(" ");


        int[] a = new int[line1.length], b = new int[line2.length];
        int i = 0;
        for (String s : line1) {
            a[i] = Integer.valueOf(s);
            i++;
        }
        i = 0;
        for (String s : line2) {
            b[i] = Integer.valueOf(s);
            i++;
        }
        Arrays.sort(b);
        int bMax = b[b.length - 1], bMin = b[0];
        int[] sortedA = a.clone();
        Arrays.sort(sortedA);
        i = 1;
        while (i < a.length && a[i] >= a[i - 1]) {
            i++;
        }
        if (i == 1) {
            if (a[0] >= a[2]) {
                if (bMax < a[i]) {
                    a[i] = bMax;
                    print(a);
                } else {
                    int j = b.length - 1;
                    while (b[j] >= a[i]) {
                        j--;
                    }
                    a[i - 1] = b[j];
                    print(a);
//                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else if (i != a.length - 1) {
            //i不在最右端
            int small = a[i - 1], big = a[i + 1];
            // 在b中找出第一个小于big的数字
            int j = b.length - 1;
            if (small > bMax) {
                while (j >=0 && b[j] > a[i]) {
                    j--;
                }
                a[i-1] = b[j];
                print(a);
            } else {
                while (j >= 0 && b[j] > big) {
                    j--;
                }
                if (j < 0) {
                    System.out.println("NO");
                } else {
                    a[i] = b[j];
                    print(a);
                }
            }
        } else if (i == a.length - 1) {
            //  i在最右端
            if (bMax < a[i - 1]) {
                if (bMax > a[i - 2]) {
                    int j = b.length - 1;
                        while (j >=0 && b[j] > a[i]) {
                            j--;
                        }
                        a[i-1] = b[j];
                        print(a);
                } else {
                    System.out.println("NO");
                }
            } else {
                a[i] = bMax;
                print(a);
            }
        } else {
            System.out.println("NO");
        }


    }

    private static void print(int[] a) {
        for (int k = 0; k < a.length; k++) {
            if (k != 0) {
                System.out.print(" ");
            }
            System.out.print(a[k]);
        }
    }

}
