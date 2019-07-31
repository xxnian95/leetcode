package com.pengnian.nowcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Zhang Pengnian
 * @since 2019-07-27 18:40
 */
public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        for (String s : strs) {
            System.out.println(s);
        }
    }

}
