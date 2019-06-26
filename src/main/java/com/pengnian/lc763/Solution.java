package com.pengnian.lc763;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-06-26 17:05
 */
class Solution {

    @Test
    void test() {
        String S = "ababcbacadefegdehijhklij";
        for (Integer integer : partitionLabels(S)) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
    }

    @Test
    void test2() {
        String S = "caedbdedda";
        for (Integer integer : partitionLabels(S)) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
    }

    @Test
    void test3() {
        String S = "eaaaabaaec";
        for (Integer integer : partitionLabels(S)) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
    }

    @Test
    void test4() {
        String S = "vhaagbqkaq";
        for (Integer integer : partitionLabels(S)) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
    }

    private List<Integer> partitionLabels(String S) {

        List<Integer> result = new ArrayList<>();
        int count = 1;
        int p1 = 0, p2 = -1;
        while (p1 < S.length() && p2 < S.length()) {
            char currentChar = S.charAt(p1);
            int currentLastIndex = S.lastIndexOf(currentChar);
            if (p2 < currentLastIndex) {
                p2 = currentLastIndex;
            }
            if (p1 == p2) {
                result.add(count);
                count = 0;
            }
            p1++;
            count++;
        }
        return result;

    }
}
