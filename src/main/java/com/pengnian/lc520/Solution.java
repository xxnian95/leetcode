package com.pengnian.lc520;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author Zhang Pengnian
 * @since 2019-05-30 15:29
 */
class Solution {

    @Test
    void test() {

        String word = "FlaG";
        System.out.println(detectCapitalUse(word));
    }

    private boolean detectCapitalUse(String word) {

        int N = word.length();
        String lowercase = word.toLowerCase();
        if (lowercase.equals(word))
            return true;
        else {
            char[] original = word.toCharArray(), lowered = lowercase.toCharArray();
            ArrayList<Integer> indexOfDifference = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (original[i] != lowered[i]) {
                    indexOfDifference.add(i);
                }
            }

            if (indexOfDifference.size() == 1) {
                return indexOfDifference.get(0) == 0;
            } else
                return indexOfDifference.size() == N;
        }

    }
}
