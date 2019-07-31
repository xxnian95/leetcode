package com.pengnian.nowcoder.q3;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 * @author Zhang Pengnian
 * @since 2019-07-27 19:39
 */
public class Q3Test {

    @Test
    void test() {

    }

    private void solution(String[] strs) {
        HashSet<Integer> set  = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (String s : strs) {
            int currentVal = Integer.valueOf(s);
            if (!set.contains(currentVal)) {
                set.add(currentVal);
            } else {
                result.append(" " + currentVal);
            }
        }
        System.out.println(result.toString());

    }
}
