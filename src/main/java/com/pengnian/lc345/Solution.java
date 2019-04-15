package com.pengnian.lc345;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-15 10:09
 */
class Solution {

    @Test
    void test() {
        String s = "aA";
        System.out.println(reverseVowels(s));
    }

    private String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int N = s.length();
        String dic = "AEIOUaeiou";
        int hi = N - 1;
        for (int i = 0; i < N; i++) {
//            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
            if (dic.contains("" + c[i])) {
                for (int j = hi; j > i; j--) {
                    if (dic.contains("" + c[j])) {
                        char tmp = c[i];
                        c[i] = c[j];
                        c[j] = tmp;
                        hi = j - 1;
                        break;
                    }
                }
            }
        }

        return new String(c);
    }
}
