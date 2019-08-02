package com.pengnian.offer.q22;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * TODO Unfinished
 * @author Zhang Pengnian
 * @since 2019-07-31 22:21
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        List<Integer> list = new LinkedList<>();
        for (String str : strs) {
            list.add(Integer.valueOf(str));
        }
        System.out.println(list);
    }
}
