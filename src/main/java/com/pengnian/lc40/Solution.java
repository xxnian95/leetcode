package com.pengnian.lc40;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author Zhang Pengnian
 * @since 2019-08-04 13:39
 */
class Solution {

    @Test
    void test() {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
            return null;
        }
        Arrays.sort(candidates);
        List<List<Integer>> results = new LinkedList<>();
        for (int i = 0; i < candidates.length; i++) {
            List<List<Integer>> result = function(candidates, target, i, new LinkedList<>());
            if (result != null) {
                results.addAll(result);
            }
        }
        List<List<Integer>> resultsWithoutDuplication = new LinkedList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (List<Integer> list : results) {
            if (!set.contains(list)) {
                set.add(list);
                resultsWithoutDuplication.add(list);
            }
        }
        return resultsWithoutDuplication;
    }

    private List<List<Integer>> function(int[] candidates, int target, int i,
                                         List<Integer> preList) {
        target = target - candidates[i];
        preList.add(candidates[i]);
        List<List<Integer>> results = new LinkedList<>();
        if (target < 0) {
            return null;
        } else if (target == 0) {
            results.add(preList);
            return results;
        }
        // target > 0
        else if (i == candidates.length - 1) {
            return null;
        } else {
            for (int j = i + 1; j < candidates.length; j++) {
                List<Integer> preListTransferToNext = new LinkedList<>(preList);
                List<List<Integer>> result = function(candidates, target, j, preListTransferToNext);
                if (result != null && result.size() != 0) {
                    results.addAll(result);
                }
            }
        }
        return results;

    }
}
