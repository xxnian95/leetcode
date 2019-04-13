package com.pengnian.lc303;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-13 14:56
 */

class NumArrayTest {

    @Test
    void test() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        NumArray n = new NumArray(a);
        System.out.println(n.sumRange(2,5));
    }
}
