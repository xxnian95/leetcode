package com.pengnian.lc443;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-05-09 20:16
 */
public class Solution {

    @Test
    void test() {
        String s = "aabbccc";
        char[] c = s.toCharArray();
        int a = compress(c);
        System.out.println("pause");
    }

    private int compress(char[] chars) {
        String result = "";
        int i = 0;
        while (i < chars.length) {
            if (i == chars.length - 1) {
                result = result + chars[i];
                i++;
            }
            else if (chars[i] == chars[i + 1]) {
                result = result + chars[i];
                int j = i + 1;
                while (j < chars.length && chars[j] == chars[i]) {
                    j++;
                }
                result = result + (j - i);
                i = j;
            } else {
                result = result + chars[i];
                i++;
            }
        }
        i = 0;
        for (char x : result.toCharArray()) {
            chars[i] = x;
            i++;
        }
        return result.length();
    }
}
