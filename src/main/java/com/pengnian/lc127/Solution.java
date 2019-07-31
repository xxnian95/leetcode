package com.pengnian.lc127;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-07-18 16:11
 */
class Solution {

    private HashSet<String> set = new HashSet<>();

    @Test
    void test() {

        String beginWord = "hit", endWord = "cog";
        List<String> wordList = new LinkedList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        System.out.println(ladderLength(beginWord, endWord, wordList));
    }


    public int ladderLength(String beginWord, String endWord,
                            List<String> wordList) {

//        System.out.println("Start: " + beginWord + ", " + endWord);

        if (beginWord == null)
            return 0;
        if (!wordList.contains(endWord)) {
            return -1;
        }
        if (beginWord.equals(endWord)) {
            return 1;
        }
        List<String> nextBeginWord = new LinkedList<>();    //  保存下一步的beginWord
        for (String string : wordList) {
            int cnt = 0;
            char[] c1 = string.toCharArray(), c2 = beginWord.toCharArray();
            for (int i = 0; i < c1.length; i++) {
                if (c1[i] != c2[i]) {
                    cnt++;
                }
            }
            if (cnt == 1 && !set.contains(string)) {
                nextBeginWord.add(string);
                set.add(string);
            }
        }
//        System.out.println(nextBeginWord);
        LinkedList<Integer> nextResult = new LinkedList<>();
        for (String s : nextBeginWord) {
            nextResult.add(ladderLength(s, endWord, wordList) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (Integer x : nextResult) {
            if (x < min)
                min = x;
        }
        return min == Integer.MAX_VALUE ? 0 : min;

    }
}
