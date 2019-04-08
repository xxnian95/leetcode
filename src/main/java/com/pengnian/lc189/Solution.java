package com.pengnian.lc189;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @date 2019-04-08 10:11
 */
public class Solution {

    @Test
    void test() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(a,k);
        for(int x:a)
            System.out.println(x);

    }

    @Test
    void test2() {
        int[] a = {-1,-100,3,99};
        int k = 2;
        rotate(a,k);
        for(int x:a)
            System.out.println(x);

    }

    private void rotate(int[] nums, int k) {
        int N = nums.length;
        if(N<=1)
            return;
        while(k>0) {
            int tmp = nums[N-1];
            for(int i=N-1;i>0;i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = tmp;
            k--;
        }
    }

}
