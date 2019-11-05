package com.pengnian.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 将String格式的数组转换为int数组
 * 识别的括号是'['和']'
 *
 * @author Zhang Pengnian
 * @since 2019-11-05 15:06
 */
public class String2Array {

    public static int[] stringToArray(String s) {

        String[] elements = s.substring(1, s.length() - 1).split(",");
        int[] result = new int[elements.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(elements[i].trim());
        }
        return result;

    }

    public static int[][] stringTo2dArray(String s) {
        s = s.substring(1, s.length() - 1);
        ArrayList<Integer[]> list = new ArrayList<>();
        int l = 0, h = 0;
        while (l < s.length() && h < s.length()) {
            if (s.charAt(l) == '[') {
                h = l + 1;
                while (h < s.length() && s.charAt(h) != ']') {
                    h++;
                }
                list.add(IntStream.of(stringToArray(s.substring(l, h + 1)))
                        .boxed().toArray(Integer[]::new));
                l = h + 1;
            }
            else {
                l++;
            }
        }
        int[][] result = new int[list.size()][list.get(0).length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Arrays.stream(list.get(i)).
                    mapToInt(Integer::valueOf).toArray();
        }
        return result;
    }

}
