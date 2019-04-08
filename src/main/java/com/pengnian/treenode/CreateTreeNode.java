package com.pengnian.treenode;

/**
 * @author Zhang Pengnian
 * @date 2019-04-05 14:34
 */
public class CreateTreeNode {
    private static TreeNode create(Integer[] array, int index) {
        TreeNode tn = null;
        if(index<array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new TreeNode(value);
            tn.left = create(array, 2 * index + 1);
            tn.right = create(array, 2 * index + 2);
            return tn;
        }
        return tn;
    }

    public static TreeNode create(Integer[] array) {
        return create(array, 0);
    }

}
