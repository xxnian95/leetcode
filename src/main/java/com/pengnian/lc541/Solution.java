package com.pengnian.lc541;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-06-01 20:59
 */
class Solution {

    @Test
    void test() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        int k = 5;
        System.out.println(reverseStr(s, k));
    }

    @Test
    void test2() {
        String s = "abcdasdfasdfasfasdfasgahgfasefg";
        int k = 3;
        System.out.println(reverseStr(s, k));
    }

    private String reverseStr(String s, int k) {

        StringBuilder result = new StringBuilder();
        int loop = s.length() / (k * 2);
        if (s.length() % (k * 2) != 0)
            loop++;
        for (int i = 0; i < loop; i++) {
            int start = 2 * k * i, end = 2 * k * (i + 1);
            if (end > s.length()) {
                end = s.length();
            }

            char[] currentPeriod = s.substring(start, end).toCharArray();
            int reverseEndIndex;
            if (end - start >= k)
                reverseEndIndex = k;
            else
                reverseEndIndex = end % k;
            for (int j = 0; j < reverseEndIndex / 2; j++) {
                char temp = currentPeriod[j];
                currentPeriod[j] = currentPeriod[reverseEndIndex - j - 1];
                currentPeriod[reverseEndIndex - j - 1] = temp;
            }
            result.append(currentPeriod);
        }
        return result.toString();

    }


}
