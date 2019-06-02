package com.pengnian.lc543;

import com.pengnian.treenode.CreateTreeNode;
import com.pengnian.treenode.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-06-02 10:18
 */
class Solution {

    static private int biggestDiameter;

    @Test
    void test() {
        Integer[] a = {1, 2, 3, 4, 5};
        TreeNode root = CreateTreeNode.create(a);
        System.out.println(diameterOfBinaryTree(root));
    }

    @Test
    void test2() {
        Integer[] a = {1};
        TreeNode root = CreateTreeNode.create(a);
        System.out.println(diameterOfBinaryTree(root));
    }

    private int diameterOfBinaryTree(TreeNode root) {

        if(root == null)
            return 0;
        getBiggestDepth(root);
        return biggestDiameter;

    }

    private int getBiggestDepth(TreeNode root) {
        int currentDiameter, leftBiggestDepth, rightBiggestDepth;
        if (root.left == null)
            leftBiggestDepth = 0;
        else
            leftBiggestDepth = getBiggestDepth(root.left) + 1;
        if (root.right == null)
            rightBiggestDepth = 0;
        else
            rightBiggestDepth = getBiggestDepth(root.right) + 1;
        currentDiameter = leftBiggestDepth + rightBiggestDepth;
        if (currentDiameter > biggestDiameter)
            biggestDiameter = currentDiameter;
        return Math.max(leftBiggestDepth, rightBiggestDepth);
    }
}
