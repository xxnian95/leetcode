package com.pengnian.lc438;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-05-08 20:05
 */
class Solution {

    @Test
    void test() {
        String s = "cbaebabacd", p = "abc";
        List<Integer> list = findAnagrams(s, p);
        for (Integer x : list)
            System.out.println(x);

    }

    //  FIXME   超时
    private List<Integer> findAnagrams(String s, String p) {
        char[] c = s.toCharArray();
        List<Character> list = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (char x : p.toCharArray()) {
            list.add(x);
        }

        for (int i = 0; i < c.length; i++) {
            if (list.indexOf(c[i]) != -1) {
                List tmpList = new LinkedList<>(list);
//                tmpList.remove(tmpList.indexOf(c[i]));
                tmpList.remove((Character)c[i]);
                int j = 1;
                while (i + j < c.length &&
                        tmpList.size() > 0 &&
                        tmpList.indexOf(c[i + j]) != -1) {
//                    tmpList.remove(tmpList.indexOf(c[i + j]));
                    tmpList.remove((Character)c[i+j]);
                    j++;
                }
                if (tmpList.size() == 0)
                    result.add(i);
            }
        }
        return result;
    }

}
