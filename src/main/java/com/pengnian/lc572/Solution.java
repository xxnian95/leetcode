package com.pengnian.lc572;

import com.pengnian.treenode.CreateTreeNode;
import com.pengnian.treenode.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author Zhang Pengnian
 * @since 2019-06-03 19:07
 */
class Solution {

    @Test
    void test() {
        Integer[] a1 = {3, 4, 5, 1, 2}, a2 = {4, 1, 3};
        TreeNode s = CreateTreeNode.create(a1), t = CreateTreeNode.create(a2);
        System.out.println(isSubtree(s, t));
    }

    @Test
    void test2() {
        Integer[] a1 = {1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, 2},
                a2 = {1, null, 1, null, 1, null, 1, null, 1, null, 1, 2};
        TreeNode s = CreateTreeNode.create(a1), t = CreateTreeNode.create(a2);
        System.out.println(isSubtree(s, t));
    }

    private boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t != null)
            return false;
        else if (s == null)
            return true;
        else {
            if (isTheSame(s, t))
                return true;
            else
                return isTheSame(s.left, t) || isTheSame(s.right, t);
        }
    }

    private boolean isTheSame(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        else if (s != null && t != null)
            return s.val == t.val && isTheSame(s.left, t.left) && isTheSame(s.right, t.right);
        else
            return false;
    }
}
