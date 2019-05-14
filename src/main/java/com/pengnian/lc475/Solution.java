package com.pengnian.lc475;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-05-14 20:52
 */
class Solution {

    @Test
    void test() {
        int[] houses = {1, 2, 3, 4,5,6,7,8}, heaters = {1, 4};
        System.out.println((findRadius(houses, heaters)));
    }

    @Test
    void test2() {
        int[] houses = {282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923},
                heaters = {823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612};
        System.out.println((findRadius(houses, heaters)));
    }

    private int findRadius(int[] houses, int[] heaters) {
        int radius = 0;
        while (true) {
            int count = 0;
            for (int house : houses) {
                for (int heater : heaters) {
                    if (heater + radius >= house && heater - radius <= house) {
                        count++;
                        break;
                    }
                }
            }
            if (count == houses.length)
                return radius;
            radius++;
        }
    }
}
