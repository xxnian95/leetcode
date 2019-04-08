package com.pengnian.lc107;

import com.pengnian.treenode.CreateTreeNode;
import com.pengnian.treenode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @date 2019-04-04 17:32
 */
class Main {
    @Test
    void test() {
        Integer[] a = {};
        TreeNode root = CreateTreeNode.create(a);
        List<List<Integer>> list = levelOrderBottom(root);
        System.out.println(list);
    }

    private List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        if (root == null)
            return result;
        list.add(root);
        while(!list.isEmpty()){
            List<Integer> curList = new ArrayList<>();
            List<TreeNode> nextList = new ArrayList<>();
            for(TreeNode t:list) {
                curList.add(t.val);
                if(t.left!=null)
                    nextList.add(t.left);
                if(t.right!=null)
                    nextList.add(t.right);
            }
            list = nextList;
            result.add(0,curList);
        }
        return result;
    }
}
