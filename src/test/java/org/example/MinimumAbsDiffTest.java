package org.example;

import bin_tree_general.TreeNode;
import binary_search_tree.MinimumAbsDiff;
import org.junit.Assert;
import org.junit.Test;

public class MinimumAbsDiffTest {
    MinimumAbsDiff m = new MinimumAbsDiff();

    @Test
    public void test1(){
        TreeNode r2 = new TreeNode(3, null, null);
        TreeNode l2 = new TreeNode(1, null, null);
        TreeNode r1 = new TreeNode(6, null, null);
        TreeNode l1 = new TreeNode(2, l2, r2);
        TreeNode root = new TreeNode(4, l1, r1);

        Assert.assertEquals(1, m.getMinimumDifference(root));
    }
}
