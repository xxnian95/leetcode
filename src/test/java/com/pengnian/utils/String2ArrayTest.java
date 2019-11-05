package com.pengnian.utils;

import org.junit.jupiter.api.Test;
/**
 * @author Zhang Pengnian
 * @since 2019-11-05 15:39
 */
class String2ArrayTest {

    @Test
    void stringToArray() {
        String s = "[1,2,3,4,5,6,7,8,9]";
        int[] result = String2Array.stringToArray(s);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    @Test
    void stringTo2dArray() {
        String s = "[[1,2,3],[4,5,6],[7,8,9]]";
        int[][] result = String2Array.stringTo2dArray(s);
        for (int[] x : result) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }
    }
}