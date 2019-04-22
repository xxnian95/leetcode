package com.pengnian.lc409;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author Zhang Pengnian
 * @date 2019-04-22 20:34
 */
class Solution {

    @Test
    void test() {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    @Test
    void test2() {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(s));
    }

    private int longestPalindrome(String s) {
        char[] c = s.toCharArray();
        ArrayList<Character> checkedLetter = new ArrayList<>();
        int count = 0, sum = 0, longestOddNumber = 0;
        for (int i = 0; i < c.length; i++) {
            count = 0;
            if (checkedLetter.indexOf(c[i]) == -1) {
                checkedLetter.add(c[i]);
                for (int j = i; j < c.length; j++) {
                    if (c[j] == c[i]) {
                        count++;
                    }
                }
            }
            if (count % 2 == 0) {
                sum = sum + count;
            } else {
                if (count > longestOddNumber) {
                    if (longestOddNumber != 0)
                        sum = sum + longestOddNumber - 1;
                    longestOddNumber = count;
                } else {
                    sum = sum + count - 1;
                }
            }
        }
        return sum + longestOddNumber;
    }
}
