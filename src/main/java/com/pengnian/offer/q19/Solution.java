package com.pengnian.offer.q19;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Zhang Pengnian
 * @since 2019-07-31 17:55
 */
public class Solution {

    private static final char ANY = '*';
    private static final char ONE = '.';


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] str = bf.readLine().toCharArray();
        char[] pattern = bf.readLine().toCharArray();
        for (char x : str) {
            System.out.print(x);
        }
        System.out.println("");
        for (char x : pattern) {
            System.out.print(x);
        }
        System.out.println("");



        Solution solution = new Solution();
        System.out.println(solution.match(str, pattern));
    }

    private boolean match(char[] str, char[] pattern) {
        if (str == null || str.length == 0 || pattern == null || pattern.length == 0) {
            return false;
        }
        return matchRegEx(str, pattern, 0, 0);
    }

    /**
     * TODO Unfinished
     * @param str 需要判断是否匹配的字符串
     * @param pattern 判断依据
     * @param i 从str的索引i开始判断
     * @param j 从pattern的索引j开始判断
     * @return str与正则表达式pattern是否匹配
     */
    private boolean matchRegEx(char[] str, char[] pattern, int i, int j) {
        if (i == str.length && j == pattern.length) {
            return true;
        } else if (i != str.length && j == str.length) {
            return false;
        }
        if (j < pattern.length && pattern[j] == ANY) {

        }

        return false;
    }


}
