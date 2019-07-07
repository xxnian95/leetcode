package com.pengnian.lc744;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Zhang Pengnian
 * @since 2019-07-07 23:15
 */
class Solution {

    @Test
    void test() {
        char[] c = {'e', 'e', 'e', 'k', 'q', 'q', 'q', 'v', 'v', 'y'};
        char target = 'k';
        System.out.println(nextGreatestLetter(c, target));
    }

    private char nextGreatestLetter(char[] letters, char target) {

        HashSet<Character> set = new HashSet<>();
        for (char c : letters)
            set.add(c);
        letters = new char[set.size()];
        int index = 0;
        for (char c : set) {
            letters[index++] = c;
        }
        Arrays.sort(letters);
        if (letters[letters.length - 1] < target || letters[0] > target)
            return letters[0];
        else if (letters[0] == target)
            return letters[1];
        else if (letters[letters.length - 1] == target)
            return letters[0];
        int low = 0, high = letters.length - 1;
        while (true) {
            int mid = low + (high - low) / 2;
            if (letters[mid] < target && letters[mid + 1] > target)
                return letters[mid + 1];
            else if (letters[mid] < target)
                low = mid;
            else if (letters[mid] > target)
                high = mid;
            else
                return letters[mid + 1];
        }
    }

}
