package com.pengnian.lc551;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-06-02 14:56
 */
class Solution {

    @Test
    void test() {
        String s = "PPALLP";
        System.out.println(checkRecord(s));
    }

    //  输出true: s中不超过一个A，并且不超过两个连续的L
    private boolean checkRecord(String s) {

        boolean flag1, flag2;
        flag1 = !s.contains("A") || s.indexOf('A') == s.lastIndexOf('A');
        flag2 = !s.contains("LLL");
        return flag1 & flag2;

    }
}
