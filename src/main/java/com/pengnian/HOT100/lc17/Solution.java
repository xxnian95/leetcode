package com.pengnian.HOT100.lc17;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-07-12 15:39
 */
class Solution {

    @Test
    void test() {
        String digits = "236";
        System.out.println(letterCombinations(digits));
    }

    private List<String> letterCombinations(String digits) {

        List<String> result = new LinkedList<>();
        int digit = digits.length();
        for (int i = 0; i < digit; i++) {
            char currentDigit = digits.charAt(i);
            result = addOneLetter(result, currentDigit);
        }
        return result;

    }

    private List<String> addOneLetter(List<String> list, char digit) {
        String string = "";
        switch (digit) {
            case '2':
                string = "abc";
                break;
            case '3':
                string = "def";
                break;
            case '4':
                string = "ghi";
                break;
            case '5':
                string = "jkl";
                break;
            case '6':
                string = "mno";
                break;
            case '7':
                string = "pqrs";
                break;
            case '8':
                string = "tuv";
                break;
            case '9':
                string = "wxyz";
                break;
        }
        List<String> newList = new LinkedList<>();
        if (list.size() == 0) {
            for (char c : string.toCharArray()) {
                newList.add(String.valueOf(c));
            }
        } else {
            for (String s : list) {
                for (char c : string.toCharArray()) {
                    String newString = s + c;
                    newList.add(newString);
                }
            }
        }
        return newList;
    }
}
