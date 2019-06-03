package com.pengnian.lc563;

import com.pengnian.treenode.CreateTreeNode;
import com.pengnian.treenode.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-06-03 17:08
 */
class Solution {

    private static int sumOfTilt;

    @Test
    void test() {
        Integer[] a = {1,2};
        TreeNode root = CreateTreeNode.create(a);
        System.out.println(findTilt(root));
    }

    private int findTilt(TreeNode root) {
        transverse(root);
        return sumOfTilt;
    }

    //  返回root的结点和
    private int getSum(TreeNode root) {
        if (root == null)
            return 0;
        return root.val + getSum(root.left) + getSum(root.right);
    }

    //  返回root的坡度
    private int getTilt(TreeNode root) {
        if (root == null)
            return 0;
        int result = Math.abs(getSum(root.left) - getSum(root.right));
        System.out.println("Treenode: " + root.val);
        System.out.println(result);
        return result;
    }

    private void transverse(TreeNode root) {
        sumOfTilt = sumOfTilt + getTilt(root);
        if (root != null) {
            if (root.left != null)
                transverse(root.left);
            if (root.right != null)
                transverse(root.right);
        }
    }
}
