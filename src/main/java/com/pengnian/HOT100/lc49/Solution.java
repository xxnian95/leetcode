package com.pengnian.HOT100.lc49;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-11-05 17:18
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] character = str.toCharArray();
            Arrays.sort(character);
            StringBuilder sb = new StringBuilder();
            for (char c : character) {
                sb.append(c);
            }
            String key = sb.toString();
            if (map.containsKey(key)) {
                List<String> list = map.get(key);
                list.add(str);
            } else {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        return new LinkedList<>(map.values());
    }

}
