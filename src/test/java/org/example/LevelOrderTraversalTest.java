package org.example;

import BFS_tree.LevelOrderTraversal;
import bin_tree_general.TreeNode;
import org.junit.Test;

public class LevelOrderTraversalTest {
    LevelOrderTraversal l = new LevelOrderTraversal();

    @Test
    public void test(){
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        TreeNode t20 = new TreeNode(20, t15, t7);
        TreeNode t9 = new TreeNode(9);
        TreeNode t3 = new TreeNode(3, t9, t20);

        l.levelOrder(t3);
    }
}
