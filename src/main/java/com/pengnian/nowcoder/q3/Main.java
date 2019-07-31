package com.pengnian.nowcoder.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author Zhang Pengnian
 * @since 2019-07-27 19:33
 */
public class Main {

    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String[] strs = bf.readLine().split(" ");

        String input = "1 2 5 7 2 1 3 3 9";
        String[] strs = input.split(" ");

        HashSet<String> set  = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (String s : strs) {
            if (!set.contains(s)) {
                if (set.size() == 0) {
                    result.append(s);
                }
                else {
                    result.append(" " + s);
                }
                set.add(s);
            }
        }
        System.out.println(result.toString());
        System.out.println("1 2 5 7 3 9");

    }
}
