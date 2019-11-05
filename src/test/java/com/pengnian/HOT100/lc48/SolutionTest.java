package com.pengnian.HOT100.lc48;

import com.pengnian.utils.String2Array;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-11-05 14:54
 */
class SolutionTest {

    @Test
    void rotateTest() {

        Solution solution = new Solution();
        String input = "[[1,2,3],[4,5,6],[7,8,9]]";
        String output = "[[7,4,1],[8,5,2],[9,6,3]]";

        int[][] matrix = String2Array.stringTo2dArray(input);
        solution.rotate(matrix);
        int[][] expect = String2Array.stringTo2dArray(output);

        for (int[] x : matrix) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        Assert.assertArrayEquals(expect, matrix);

    }
}