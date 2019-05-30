package com.pengnian.lc530;

import com.pengnian.treenode.CreateTreeNode;
import com.pengnian.treenode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zhang Pengnian
 * @since 2019-05-30 16:39
 */
class Solution {

    @Test
    void test() {
        Integer[] a = {1, 4, 5, 7, 6, 3, null};
        TreeNode root = CreateTreeNode.create(a);
        System.out.println(getMinimumDifference(root));
    }

    private int getMinimumDifference(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        TreeNode temp;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            temp = queue.poll();
            list.add(temp.val);
            if (temp.left != null)
                queue.offer(temp.left);
            if (temp.right != null)
                queue.offer(temp.right);
        }
        int[] val = new int[list.size()];
        for (int i = 0; i < val.length; i++) {
            val[i] = list.get(i);
        }
        Arrays.sort(val);

        int[] difference = new int[val.length - 1];
        for (int i = 0; i < val.length - 1; i++) {
            difference[i] = val[i + 1] - val[i];
        }

        int result = Integer.MAX_VALUE;
        for (int integer : difference) {
            if (integer < result)
                result = integer;
        }
        return result;
    }
}
