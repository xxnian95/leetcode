package com.pengnian.HOT100.lc49;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-11-05 17:48
 */
class SolutionTest {

    @Test
    void groupAnagramsTest() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Solution solution = new Solution();
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
    }

}