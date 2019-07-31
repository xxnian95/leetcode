package com.pengnian.nowcoder.q2;

import java.util.*;

/**
 * @author Zhang Pengnian
 * @since 2019-07-27 20:06
 */
public class Main {

    public static void main(String[] args) {

        int sum = 15;
        int[] nums = {5, 5, 10, 2, 3};


        Arrays.sort(nums);
        List<Integer> list = new LinkedList<>();
        for (int x : nums) {
            list.add(x);
        }
        System.out.println(f1(list, sum, ""));
    }

    private static int f1(List<Integer> list, int sum, String path) {
        if (sum < 0 || list.size() == 0) {
            System.out.println(path);
            System.out.println("Fail");
            return 0;
        }
        int biggest = list.get(list.size() - 1);
        if (biggest > sum) {
            return 0;
        }
        int currentSum = 0;
        List<Integer> modifiedList = new LinkedList<>(list);
        //  list用来遍历，modifiedList用来修改
        for (Integer x : list) {
            if (list.contains(sum)) {
//                System.out.println("x=" + sum);
                System.out.println(path);
                System.out.println("Success!");
                return 1;
            }
            modifiedList.remove((Integer)x);
            List<Integer> nextList = new LinkedList<>(modifiedList);
            String currentPath = path + x;
//            System.out.println("x=" + x);
//            System.out.println("list=" + modifiedList);
//            System.out.println("sum=" + (sum - x));
            currentSum += f1(modifiedList, sum - x, currentPath);
        }
        return currentSum;
    }
}
