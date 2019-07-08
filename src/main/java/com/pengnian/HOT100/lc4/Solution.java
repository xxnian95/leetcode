package com.pengnian.HOT100.lc4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-07-08 02:09
 */
class Solution {

    @Test
    void test() {
        int[] nums1 = {1, 3, 5, 6, 9, 10, 34, 67}, nums2 = {2, 3, 6, 8, 15, 24};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void test2() {
        int[] nums1 = {1, 2}, nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void test3() {
        int[] nums1 = {1}, nums2 = {1};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void test4() {
        int[] nums1 = {2, 2, 2, 2}, nums2 = {2, 2, 2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void test5() {
        int[] nums1 = {2, 3}, nums2 = {1};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void test6() {
        int[] nums1 = {1}, nums2 = {2, 3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void test7() {
        int[] nums1 = {2, 3, 4, 5}, nums2 = {1};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    @Test
    void test8() {
        int[] nums1 = {1}, nums2 = {2, 3, 4, 5, 6};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    private double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length == 0 || nums2.length == 0) {
            int[] notEmpty = nums1.length == 0 ? nums2 : nums1;
            if (notEmpty.length % 2 == 0) {
                return (notEmpty[notEmpty.length / 2] + notEmpty[notEmpty.length / 2 - 1]) / 2.0;
            } else {
                return notEmpty[notEmpty.length / 2];
            }
        }
        double mid = (nums1.length + nums2.length) / 2.0;
        if ((nums1.length + nums2.length) % 2 == 0) {
            //  有两个中位数，分别在mid-0.5和mid+0.5
            int i = 0, j = 0;
            while (true) {
                if (i + j == mid - 1) {
                    List<Integer> list = new ArrayList<>();
                    if (i < nums1.length)
                        list.add(nums1[i]);
                    if (j < nums2.length)
                        list.add(nums2[j]);
                    if (i + 1 < nums1.length)
                        list.add(nums1[i + 1]);
                    if (j + 1 < nums2.length)
                        list.add(nums2[j + 1]);
                    int[] temp = new int[list.size()];
                    int tempIndex = 0;
                    for (int x : list)
                        temp[tempIndex++] = x;
                    Arrays.sort(temp);
                    return ((double) temp[0] + temp[1]) / 2;
                }
                if (i == nums1.length)
                    j++;
                else if (j == nums2.length)
                    i++;
                else if (nums1[i] <= nums2[j])
                    i++;
                else
                    j++;
            }
        } else {
            //  只有一个中位数，位于mid
            int i = 0, j = 0;
            int median;
            while (true) {
                if (i == nums1.length)
                    j++;
                else if (j == nums2.length)
                    i++;
                else if (nums1[i] <= nums2[j])
                    i++;
                else
                    j++;
                if (i + j == (int) mid) {
                    if (i == nums1.length)
                        median = nums2[j];
                    else if (j == nums2.length)
                        median = nums1[i];
                    else
                        median = Math.min(nums1[i], nums2[j]);
                    return (double) median;
                }
            }
        }

    }
}
