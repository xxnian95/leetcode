package com.pengnian.lc278;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-11 21:53
 */
public class Solution {

    @Test
    void test() {
        System.out.println(firstBadVersion(2126753390));
    }

    private int firstBadVersion(int n) {
        long left = 0;   // 指向正确的版本号
        long right = n;  // 指向错误的版本号
        while (true) {
            long mid = (left + right) / 2;
            if (mid == left)
                mid++;
            else if (mid == right)
                mid--;
            if (isBadVersion((int) mid)) {
                // mid是错误的版本，第一个错误的版本在(left, mid]
                right = mid;
            } else {
                // mid是正确的版本，第一个错误的版本在(mid, right)
                left = mid;
            }
            if (left + 1 == right)
                return (int) right;
        }
    }

    private boolean isBadVersion(int version) {
        return version >= 1702766719;
    }
}
