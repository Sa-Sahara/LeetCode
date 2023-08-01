package org.example;

import bin_tree_general.TreeNode;
import bin_tree_general.sum_root_to_leaf.SumRootToLeaf;
import org.junit.Assert;
import org.junit.Test;

public class SumRootToLeafTest {
    SumRootToLeaf s = new SumRootToLeaf();

    @Test
    public void test1(){
        TreeNode r2 = new TreeNode(3, null, null);
        TreeNode l2 = new TreeNode(2, null, null);
        TreeNode root = new TreeNode(1, l2, r2);

        Assert.assertEquals(25, s.sumNumbers(root));
    }

    @Test
    public void test2(){
        TreeNode r2 = new TreeNode(5, null, null);
        TreeNode l2 = new TreeNode(1, null, null);
        TreeNode r1 = new TreeNode(0, null, null);
        TreeNode l1 = new TreeNode(9, l2, r2);
        TreeNode root = new TreeNode(4, l1, r1);

        Assert.assertEquals(1026, s.sumNumbers(root));
    }
}
