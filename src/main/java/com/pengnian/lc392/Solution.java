package com.pengnian.lc392;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-07-02 14:14
 */
class Solution {

    @Test
    void test() {
        String s = "acb", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    private boolean isSubsequence(String s, String t) {

        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == -1)
                return false;
        }
        return true;
    }

}
