package org.example;

import bin_tree_general.flattern.FlattenBinaryTree;
import bin_tree_general.TreeNode;
import org.junit.Test;

public class FlattenBinaryTreeTest {

    FlattenBinaryTree f = new FlattenBinaryTree();

    @Test
    public void test1() {
        TreeNode r2 = new TreeNode(4, null, null);
        TreeNode l2 = new TreeNode(3, null, null);
        TreeNode l3 = new TreeNode(6, null, null);
        TreeNode r1 = new TreeNode(5, null, l3);
        TreeNode l1 = new TreeNode(2, l2, r2);
        TreeNode root = new TreeNode(1, l1, r1);

        f.flatten(root);
    }
    @Test
    public void test2(){
        TreeNode r1 = new TreeNode(3, null, null);
        TreeNode l1 = new TreeNode(2, r1, null);
        TreeNode root = new TreeNode(1, null, l1);

        f.flatten(root);
    }
}
