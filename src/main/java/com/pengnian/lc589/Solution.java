package com.pengnian.lc589;

import com.pengnian.ntree.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-06-05 23:08
 */
class Solution {

    private List<Integer> result;

    @Test
    void test() {

        Node node21 = new Node(5, null), node22 = new Node(6, null),
                node11 = new Node(3, null), node12 = new Node(2, null),
                node13 = new Node(4, null), node0 = new Node(1, null);
        node0.children = new ArrayList<>(Arrays.asList(node11, node12, node13));
        node11.children = new ArrayList<>(Arrays.asList(node21, node22));
        List<Integer> result = preorder(node0);
        for (Integer integer : result)
            System.out.println(integer);

    }

    private List<Integer> preorder(Node root) {

        result = new ArrayList<>();
        traversal(root);
        return result;

    }

    private void traversal(Node root) {
        if (root != null) {
            result.add(root.val);
            if (root.children != null) {
                for (Node node : root.children) {
                    traversal(node);
                }
            }
        }
    }
}
