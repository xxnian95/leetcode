package com.pengnian.lc680;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-06-07 18:45
 */
class Solution {

    @Test
    void test() {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(validPalindrome(s));
    }

    private boolean validPalindrome(String s) {

        int i = -1, j = s.length();
        while (++i < --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        }
        return true;

    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i++ < j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
