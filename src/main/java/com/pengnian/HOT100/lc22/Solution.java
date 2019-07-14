package com.pengnian.HOT100.lc22;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Zhang Pengnian
 * @since 2019-07-14 20:29
 */
class Solution {

    @Test
    void test() {
        int n = 10;
        System.out.println(generateParenthesis(n));
    }

    List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        if(n == 0)
            return list;
        Queue<String> queue = new LinkedList<>();
        generateParenthesis(2 * n - 1, queue);
        for (String s : queue) {
            if (isCorrect(s))
                list.add(s);
        }
        return list;
    }

    void generateParenthesis(int n, Queue<String> queue) {
        String choice1 = "(", choice2 = ")";
        if (queue.isEmpty()) {
            queue.offer(choice1);
            queue.offer(choice2);
        } else {
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                String currentStr = queue.poll();
                queue.offer(currentStr + choice1);
                queue.offer(currentStr + choice2);
            }
            n--;
        }
        if (n != 0) {
            generateParenthesis(n, queue);
        }
    }

    private boolean isCorrect(String s) {
        if (s.length() % 2 != 0)
            return false;
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt < 0)
                return false;
        }
        return cnt == 0;
    }
}
