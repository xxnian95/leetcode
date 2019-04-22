package com.pengnian.lc412;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @date 2019-04-22 21:39
 */
class Solution {

    @Test
    void test() {
        int n = 15;
        List<String> list = fizzBuzz(n);
        for (String x : list) {
            System.out.println(x);
        }
    }

    private List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            int currentNum = i;
            String currentString = "";
            if (exactDivisionByThree(currentNum))
                currentString = currentString + "Fizz";
            if (currentNum % 5 == 0) {
                currentString = currentString + "Buzz";
            }
            if(currentString == "")
                currentString = Integer.toString(currentNum);
            list.add(currentString);
            i++;
        }
        return list;
    }

    private boolean exactDivisionByThree(int num) {
        if (num < 10) {
            if (num == 0 || num == 3 || num == 6 || num == 9)
                return true;
            else
                return false;
        }
        ArrayList<Integer> digits = new ArrayList<>();
        while (num != 0) {
            digits.add(num % 10);
            num = num / 10;
        }
        int sumOfAllDigits = 0;
        for (int x : digits) {
            sumOfAllDigits = sumOfAllDigits + x;
        }
        return exactDivisionByThree(sumOfAllDigits);
    }
}
