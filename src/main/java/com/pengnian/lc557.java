package com.pengnian;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-06-02 15:48
 */
class lc557 {

    @Test
    void test() {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    private String reverseWords(String s) {

        String[] dividedWord = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String string : dividedWord) {
            char[] word = string.toCharArray();
            for (int i = 0; i < word.length / 2; i++) {
                char temp = word[i];
                word[i] = word[word.length - i - 1];
                word[word.length - i - 1] = temp;
            }
            result.append(word);
            result.append(' ');
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();

    }
}
