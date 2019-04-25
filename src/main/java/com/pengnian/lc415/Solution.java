package com.pengnian.lc415;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author Zhang Pengnian
 * @date 2019-04-25 16:36
 */
class Solution {

    @Test
    void test() {
        String num1 = "247589730452375982374895902376738", num2 = "754829037589234758723097549807209620937";
        System.out.println(addStrings(num1, num2));
    }

    @Test
    void test2() {
        String num1 = "153", num2 = "2986";
        System.out.println(addStrings(num1, num2));
    }

    private String addStrings(String num1, String num2) {

        ArrayList<Character> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        for (char x : num1.toCharArray()) {
            list1.add(x);
        }
        for (char x : num2.toCharArray()) {
            list2.add(x);
        }
        while (list1.size() != list2.size()) {
            if (list1.size() > list2.size())
                list2.add(0, '0');
            else
                list1.add(0, '0');
        }
        ArrayList<Character> list3 = new ArrayList<>();
        char[] carry = new char[list1.size()];
        for (int i = list1.size() - 1; i >= 0; i--) {
            char currentSum = (char) (list1.get(i) + list2.get(i) - '0');
            if (i != list1.size() - 1) {
                currentSum = (char) (currentSum + carry[i + 1]);
            }

            if (currentSum > '9') {
                //  产生进位
                carry[i] = 1;
                currentSum = (char) (currentSum - 10);
            }

            list3.add(0, currentSum);
        }
        if (carry[0] == 1)
            list3.add(0, '1');
        String sum = "";
        for (char x : list3)
            sum = sum + x;
        return sum;
    }
}
