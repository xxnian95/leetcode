package com.pengnian.lc401;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @date 2019-04-21 16:47
 */
class Solution {


    @Test
    void test() {
        int n = 2;
        List<String> list = readBinaryWatch(n);
        for (String x : list) {
            System.out.println(x);
        }
    }

    private List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<>();
        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                int count = 0;
                int currentHour = hour, currentMinute = minute;
                while (currentHour != 0) {
                    if (currentHour % 2 == 1)
                        count++;
                    currentHour = currentHour / 2;
                }
                while (currentMinute != 0) {
                    if (currentMinute % 2 == 1)
                        count++;
                    currentMinute = currentMinute / 2;
                }
                if (count != num)
                    continue;
                String minuteString;
                if (minute < 10)
                    minuteString = "0" + minute;
                else
                    minuteString = String.valueOf(minute);
                list.add(hour + ":" + minuteString);
            }
        }
        return list;
    }
}
