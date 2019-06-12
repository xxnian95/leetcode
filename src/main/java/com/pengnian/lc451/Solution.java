package com.pengnian.lc451;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-06-12 23:07
 */
class Solution {

    @Test
    void test() {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    private String frequencySort(String s) {

        char[] c = s.toCharArray();
        Arrays.sort(c);
        List<StringBuilder> buckets = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            buckets.add(new StringBuilder());
        }
        int i = 0;
        while (i < c.length) {
            int count = 1;
            while (i + count < s.length() && c[i] == c[i + count]) {
                count++;
            }
            count--;
            buckets.get(count).append(c[i]);
            i = i + count + 1;
        }
        StringBuilder result = new StringBuilder();
        i = s.length() - 1;
        while (i >= 0) {
            StringBuilder bucket = buckets.get(i), currentResult = new StringBuilder();
            for (int j = 0; j < bucket.length(); j++) {
                for (int k = 0; k <= i; k++) {
                    currentResult.append(bucket.charAt(j));
                }
            }
                result.append(currentResult);
            i--;
        }
        return result.toString();

    }
}
