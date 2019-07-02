package com.pengnian.lc605;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-07-02 13:43
 */
class Solution {

    @Test
    void test() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    private boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if(flowerbed.length==1)
            return flowerbed[0]==0 || n==0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (i + 1 < flowerbed.length && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    flowerbed[i] = 1;
                    i++;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            } else {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    flowerbed[i] = 1;
                }
            }

        }
        for (int x: flowerbed)
            System.out.print(x + " ");
        return n <= 0;

    }

}
