package com.pengnian.acmcoder.q1;

import com.pengnian.listnode.ListNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * https://exercise.acmcoder.com/online/online_judge_ques?ques_id=3327&konwledgeId=155
 * 小米2017秋招真题
 *
 * @author Zhang Pengnian
 * @since 2019-08-02 15:54
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        String[] strs = new String[num];
        for (int i = 0; i < num; i++) {
            strs[i] = bf.readLine();
        }
        String[] result = decode(strs);
        for (String s : result) {
            System.out.println(s);
        }

    }

    private static String[] decode(String[] strs) {
        String[] results = new String[strs.length];
        for (int i = 0; i < strs.length; i++) {
            results[i] = decode(strs[i]);
        }
        return results;
    }

    private static String decode(String str) {
        boolean[] used = new boolean[str.length()];
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Character> charList = new LinkedList<>();
        for (char c : str.toCharArray()) {
            charList.add(c);
        }
        //判断是否包含0
        while (charList.contains('Z')) {
            list.add(2);
            charList.remove((Character)'Z');
            charList.remove((Character)'E');
            charList.remove((Character)'R');
            charList.remove((Character)'O');
        }
        //判断是否包含2
        while (charList.contains('W')) {
            list.add(4);
            charList.remove((Character)'T');
            charList.remove((Character)'W');
            charList.remove((Character)'O');
        }
        //判断是否包含6
        while (charList.contains('X')) {
            list.add(8);
            charList.remove((Character)'S');
            charList.remove((Character)'I');
            charList.remove((Character)'X');
        }

        //判断是否包含8
        while (charList.contains('G')) {
            list.add(0);
            charList.remove((Character)'E');
            charList.remove((Character)'I');
            charList.remove((Character)'G');
            charList.remove((Character)'H');
            charList.remove((Character)'T');
        }
        //是否包含3
        while (charList.contains('H')) {
            list.add(5);
            charList.remove((Character)'T');
            charList.remove((Character)'H');
            charList.remove((Character)'R');
            charList.remove((Character)'E');
            charList.remove((Character)'E');
        }
        //判断是否包含7
        while (charList.contains('S')) {
            list.add(9);
            charList.remove((Character)'S');
            charList.remove((Character)'E');
            charList.remove((Character)'V');
            charList.remove((Character)'E');
            charList.remove((Character)'N');
        }
        //判断是否包含5
        while (charList.contains('V')) {
            list.add(7);
            charList.remove((Character)'F');
            charList.remove((Character)'I');
            charList.remove((Character)'V');
            charList.remove((Character)'E');
        }
        //判断是否包含4
        while (charList.contains('F')) {
            list.add(6);
            charList.remove((Character)'F');
            charList.remove((Character)'O');
            charList.remove((Character)'U');
            charList.remove((Character)'R');
        }
        //判断是否包含1
        while (charList.contains('O')) {
            list.add(3);
            charList.remove((Character)'O');
            charList.remove((Character)'N');
            charList.remove((Character)'E');
        }
        while (charList.contains('N')) {
            list.add(1);
            charList.remove((Character)'N');
            charList.remove((Character)'I');
            charList.remove((Character)'N');
            charList.remove((Character)'E');
        }
        int[] nums = new int[list.size()];
        int index = 0;
        for (int x : list) {
            nums[index] = x;
            index++;
        }
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for (int x : nums) {
            sb.append(x);
        }

        return sb.toString();
    }

}
