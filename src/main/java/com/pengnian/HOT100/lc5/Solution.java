package com.pengnian.HOT100.lc5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Zhang Pengnian
 * @since 2019-07-08 22:43
 */
class Solution {

    @Test
    void test() {
        String s = "ababd";
        System.out.println(longestPalindrome(s));
    }


    private String longestPalindrome(String s) {

        String longest = "";
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + Math.max(1, longest.length()); j < s.length(); j++) {
                if (j - i > longest.length() - 1) {
                    boolean isPalindrome = true;
                    for (int k = i; k <= j; k++) {
                        if (c[k] != c[j - k + i]) {
                            isPalindrome = false;
                            break;
                        }
                    }
                    if (isPalindrome) {
                        longest = s.substring(i, j + 1);
                    }
                }
            }
        }
        if (s.length() >= 1 && longest.equals(""))
            return s.substring(0, 1);
        return longest;
    }
}
