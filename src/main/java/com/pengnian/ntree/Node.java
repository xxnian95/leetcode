package com.pengnian.ntree;

import java.util.List;

/**
 * @author Zhang Pengnian
 * @since 2019-06-05 23:10
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
