package com.pengnian.lc558;

import com.pengnian.quadtree.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author Zhang Pengnian
 * @since 2019-06-02 16:03
 */
class Solution {

    @Test
    void test() {
        Node a1 = new Node(true),
                a2 = new Node(true),
                a3 = new Node(false),
                a4 = new Node(false);
        Node a = new Node(a1, a2, a3, a4);

        Node b21 = new Node(false),
                b22 = new Node(false),
                b23 = new Node(true),
                b24 = new Node(true);
        Node b1 = new Node(true),
                b2 = new Node(b21, b22, b23, b24),
                b3 = new Node(true),
                b4 = new Node(false);
        Node b = new Node(b1, b2, b3, b4);
        Node result = intersect(a, b);
        System.out.println("pause");
    }

    private Node intersect(Node quadTree1, Node quadTree2) {

//        if (quadTree1.isLeaf || quadTree2.isLeaf)
//            return new Node(true, true, null, null, null, null);
//        ArrayList<Node> list1 = new ArrayList<>(), list2 = new ArrayList<>(), list = new ArrayList<>();
//        list1.add(quadTree1.topLeft);
//        list1.add(quadTree1.topRight);
//        list1.add(quadTree1.bottomLeft);
//        list1.add(quadTree1.bottomRight);
//        list2.add(quadTree2.topLeft);
//        list2.add(quadTree2.topRight);
//        list2.add(quadTree2.bottomLeft);
//        list2.add(quadTree2.bottomRight);
//        for (int i = 0; i < 4; i++) {
//            Node currentNode1 = list1.get(i), currentNode2 = list2.get(i);
//            if (!currentNode1.isLeaf && currentNode2.isLeaf) {
//                //  不全是叶子
//                list.add(new Node(true, true, null, null, null, null));
//            } else if (currentNode1.val || currentNode2.val) {
//                //  全是叶子，不全为false
//                list.add(new Node(true, true, null, null, null, null));
//            } else {
//                list.add(new Node(false, true, null, null, null, null));
//            }
//        }
//
//        if (list.get(0).val == list.get(1).val == list.get(2).val == list.get(3).val)
//            return new Node(list.get(0).val, true, null, null, null, null);
//        return new Node(false, false, list.get(0), list.get(1), list.get(2), list.get(3));

        if (quadTree1.isLeaf && quadTree2.isLeaf)
            return new Node(quadTree1.val || quadTree2.val, true, null, null, null, null);
        else if (quadTree1.isLeaf) {
            //  1是叶子，2不是
            quadTree1 = new Node(false, false,
                    new Node(quadTree1.val, true, null, null, null, null),
                    new Node(quadTree1.val, true, null, null, null, null),
                    new Node(quadTree1.val, true, null, null, null, null),
                    new Node(quadTree1.val, true, null, null, null, null));
        } else if (quadTree2.isLeaf) {
            //  2是叶子，1不是
            quadTree2 = new Node(false, false,
                    new Node(quadTree2.val, true, null, null, null, null),
                    new Node(quadTree2.val, true, null, null, null, null),
                    new Node(quadTree2.val, true, null, null, null, null),
                    new Node(quadTree2.val, true, null, null, null, null));
        }
        Node result = new Node(false, false,
                intersect(quadTree1.topLeft, quadTree2.topLeft),
                intersect(quadTree1.topRight, quadTree2.topRight),
                intersect(quadTree1.bottomLeft, quadTree2.bottomLeft),
                intersect(quadTree1.bottomRight, quadTree2.bottomRight));
        if (result.topLeft.val == result.topRight.val && result.topRight.val == result.bottomLeft.val && result.bottomLeft.val == result.bottomRight.val
                && result.topLeft.isLeaf && result.topRight.isLeaf && result.bottomLeft.isLeaf && result.bottomRight.isLeaf)
            return new Node(result.topLeft.val, true, null, null, null, null);
        return result;


        //  ---------------------------------------------
//        if (quadTree1.isLeaf || quadTree2.isLeaf) {
//            //  至少有一个树叶
//            if (quadTree1.isLeaf && quadTree2.isLeaf) {
//                //  两者均为树叶
//                quadTree1.val = quadTree1.val || quadTree2.val;
//                return quadTree1;
//            } else if (quadTree1.isLeaf) {
//                //  1为树叶
//                if (quadTree1.val)
//                    return quadTree1;
//                else
//                    return quadTree2;
//            } else {
//                //  2为树叶
//                if (quadTree2.val)
//                    return quadTree2;
//                else
//                    return quadTree1;
//            }
//        } else {
//            //  两者均不为树叶
//            quadTree1.topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
//            quadTree1.topRight = intersect(quadTree1.topRight, quadTree2.topRight);
//            quadTree1.bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
//            quadTree1.bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
//
//            int countTrue = 0, countFalse = 0;
//            if (quadTree1.topLeft.isLeaf && quadTree1.topRight.isLeaf && quadTree1.bottomLeft.isLeaf && quadTree1.bottomRight.isLeaf) {
//                if(quadTree1.topLeft.val)
//                    countTrue++;
//                else
//                    countFalse++;
//                if(quadTree1.topRight.val)
//                    countTrue++;
//                else
//                    countFalse++;
//                if(quadTree1.bottomLeft.val)
//                    countTrue++;
//                else
//                    countFalse++;
//                if(quadTree1.bottomRight.val)
//                    countTrue++;
//                else
//                    countFalse++;
//            }
//            if(countTrue == 4 || countFalse==4)
//                quadTree1 = quadTree1.topLeft;
//            return quadTree1;
//        }
    }

}
