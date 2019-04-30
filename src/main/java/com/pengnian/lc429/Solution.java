package com.pengnian.lc429;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Zhang Pengnian
 * @date 2019-04-30 09:56
 */
class Solution {

    @Test
    void test() {
        Node node5 = new Node(5, null);
        Node node6 = new Node(6, null);
        List<Node> children3 = new ArrayList<>();
        children3.add(node5);
        children3.add(node6);
        Node node3 = new Node(3, children3);
        Node node2 = new Node(2, null);
        Node node4 = new Node(4, null);
        List<Node> children1 = new ArrayList<>();
        children1.add(node3);
        children1.add(node2);
        children1.add(node4);
        Node node1 = new Node(1, children1);
        List<List<Integer>> list = levelOrder(node1);
        System.out.println(list);
    }

    private List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>(); //  用来存放下一级的所有节点
        List<List<Integer>> result = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int numOfQueue = queue.size();
            List<Integer> currentTreeVal = new ArrayList<>();
            while (numOfQueue != 0) {
                Node currentPeek = queue.poll();
                if (currentPeek != null) {
                    currentTreeVal.add(currentPeek.val);
                    if (currentPeek.children != null) {
                        queue.addAll(currentPeek.children);
                    }
                }
                numOfQueue--;
            }
            result.add(currentTreeVal);
        }


        return result;
    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
