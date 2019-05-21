package com.pengnian.lc482;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-05-21 17:35
 */
class Solution {

    @Test
    void test() {
        String S = "2-5g-3-J";
        int K = 2;
        System.out.println(licenseKeyFormatting(S, K));
    }

    private String licenseKeyFormatting(String S, int K) {
        char[] c = S.toCharArray();
        StringBuilder result = new StringBuilder();
        int coutK = K;
        boolean firstDashFlag = false;
        for (char character : c) {
            if (!firstDashFlag) {
                //  还未到达第一个'-'
                if (character == '-') {
                    firstDashFlag = true;
                }
                if (character > 96)
                    result.append((char) (character - 32));
                else
                    result.append(character);
            } else {
                //  已经加入了第一个'-'
                if (character != '-') {
                    if (coutK == 0) {
                        coutK = K;
                        result.append('-');
                    }
                    if (character > 96)
                        result.append((char) (character - 32));
                    else
                        result.append(character);
                    coutK--;

                }
            }
        }
        return result.toString();
    }
}
