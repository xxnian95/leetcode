package com.pengnian.liulishuo;

/**
 * 流利说笔试编程题
 * @author Zhang Pengnian
 * @since 2019-07-30 18:49
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = bf.readLine();
            if (str == null) {
                break;
            } else {
                System.out.println(code(str));
            }
        }

    }

    private static int code (String str) {
        char[] c = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>(c.length);
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) + 1);
            } else {
                map.put(c[i], 1);
            }
        }
        PriorityQueue<Node> queue = new PriorityQueue<>(map.size(), new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.w - o2.w;
            }
        });

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            queue.offer(new Node(entry.getValue(), entry.getKey()));
        }
        while (queue.size() > 1) {
            Node left = queue.poll(), right = queue.poll(), pre = new Node(left.w + right.w);
            pre.left = left;
            pre.right = right;
            queue.offer(pre);
        }
        Node root = queue.poll();
        return size(root, 0);
    }

    private static int size(Node node, int d) {
        if (node == null) {
            return 0;
        } else {
            if (node.c == null) {
                return size(node.left, d + 1) + size(node.right, d + 1);
            } else {
                return node.w * d + size(node.left, d + 1) + size(node.right, d + 1);
            }
        }
    }
}

class Node {
    int w;
    Node left;
    Node right;
    Character c;
    Node(int w) {
        super();
        this.w = w;
    }
    Node(int w, char c) {
        super();
        this.w = w;
        this.c = c;
    }
}