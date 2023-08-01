package org.example;

import BFS_tree.AverageLevelsBinaryTree;
import bin_tree_general.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AverageLevelsBinaryTreeTest {
    AverageLevelsBinaryTree a = new AverageLevelsBinaryTree();

    @Test
    public void test1(){
        TreeNode r2 = new TreeNode(7, null, null);
        TreeNode l2 = new TreeNode(15, null, null);
        TreeNode r1 = new TreeNode(20, l2, r2);
        TreeNode l1 = new TreeNode(9, null, null);
        TreeNode root = new TreeNode(3, l1, r1);

        List<Double> result = List.of(3.00000, 14.5000, 11.00000);
        Assert.assertArrayEquals(new List[]{result}, new List[]{a.averageOfLevels(root)});
    }
}
