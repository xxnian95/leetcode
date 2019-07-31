package com.pengnian.nowcoder.q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.CollectionCertStoreParameters;

/**
 * @author Zhang Pengnian
 * @since 2019-07-27 19:26
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");

//        String[] strs = {"ABC", "ABCABC"};
//        String[] strs = {"abc", "abc"};

        String s1 = strs[0], s2 = strs[1];


        int endIndex = 1;
        String lastSuccess = "";
        if (s1.length() == 0 || s2.length() == 0) {
            System.out.println();
        }else if (s1.length() > s2.length()) {
            while (endIndex <= s1.length()) {
                String s = s1.substring(0, endIndex);
                if (s1.contains(s) && s2.contains(s)) {
                    lastSuccess = s;
                    endIndex++;
                } else {
                    break;
                }
            }
            System.out.println(lastSuccess);
        } else {
            while (endIndex <= s2.length()) {
                String s = s2.substring(0, endIndex);
                if (s1.contains(s) && s2.contains(s)) {
                    lastSuccess = s;
                    endIndex++;
                } else {
                    break;
                }
            }
            System.out.println(lastSuccess);
        }

    }
}
