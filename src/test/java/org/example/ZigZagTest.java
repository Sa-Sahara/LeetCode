package org.example;

import BFS_tree.ZigZag;
import bin_tree_general.TreeNode;
import org.junit.Test;

public class ZigZagTest {
    ZigZag zigZag = new ZigZag();

    @Test
    public void test(){
        TreeNode t10 = new TreeNode(10);
        TreeNode t11 = new TreeNode(11);
        TreeNode t9 = new TreeNode(9, t10, t11);
        TreeNode t21 = new TreeNode(21);
        TreeNode t22 = new TreeNode(22);
        TreeNode t20 = new TreeNode(20, t21, t22);
        TreeNode t3 = new TreeNode(3, t9, t20);

        zigZag.zigzagLevelOrder(t3);
    }
}
