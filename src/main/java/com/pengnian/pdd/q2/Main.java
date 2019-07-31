package com.pengnian.pdd.q2;

/**
 * @author Zhang Pengnian
 * @since 2019-07-28 15:17
 */

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        String[] strs = bf.readLine().split(" ");

        String[] strs = {"CAT", "TIGER", "RPC"};


        List<String> list = new LinkedList<>();
        HashSet<String> set = new HashSet<>();
        for (String s : strs) {
            list.add(s);
        }

        String headStr = list.get(0);
        set.add(headStr);
        char head = headStr.charAt(0);
        int headIndex = 0;
        whileLoop:
        while (list.size() != 1) {

            for (int i = 0; i < list.size(); i++) {
                char end = headStr.charAt(headStr.length() - 1);
                if (!set.contains(list.get(i)) && list.get(i).charAt(0) == end) {
                    String endStr = list.get(i);
                    set.add(endStr);
                    list.remove(headIndex);
                    headStr = endStr;
                    continue whileLoop;
                }
            }
            break;
        }
        if (list.size() != 1) {
            System.out.println(false);
        } else {
            char end = headStr.charAt(headStr.length() - 1);
            if (end == head) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }

}

