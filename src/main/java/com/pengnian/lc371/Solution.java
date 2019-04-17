package com.pengnian.lc371;

import org.junit.jupiter.api.Test;


/**
 * @author Zhang Pengnian
 * @date 2019-04-17 15:05
 */
class Solution {

    @Test
    void test() {
        int a = 2, b = 3;
        System.out.println(getSum(a, b));
    }

    //  FIXME 照着评论写的代码结果还是有问题
    private int getSum(int a, int b) {
        int carry, sum;
        sum = a ^ b;
        carry = a & b << 1;
        if(carry!=0){
            return getSum(sum, carry);
        }
        return sum;
    }
}
