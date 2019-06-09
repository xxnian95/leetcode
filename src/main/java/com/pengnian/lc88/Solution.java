package com.pengnian.lc88;

import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-06-08 21:18
 */
class Solution {

    @Test
    void test() {
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        for (int x : nums1) {
            System.out.println(x);
        }
    }

    private void merge(int[] nums1, int m, int[] nums2, int n) {

        int writePointer = m + n - 1;
        int p1 = m - 1, p2 = n - 1;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 < 0)
                nums1[writePointer--] = nums2[p2--];
            else if (p2 < 0)
                nums1[writePointer--] = nums1[p1--];
            else if (nums1[p1] < nums2[p2])
                nums1[writePointer--] = nums2[p2--];
            else
                nums1[writePointer--] = nums1[p1--];
        }
    }

}
