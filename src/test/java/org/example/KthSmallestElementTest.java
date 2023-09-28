package org.example;

import bin_tree_general.TreeNode;
import binary_search_tree.kth_smallest.KthSmallestElement;
import org.junit.Assert;
import org.junit.Test;

public class KthSmallestElementTest {
    KthSmallestElement k = new KthSmallestElement();

    @Test
    public void test1(){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2, t1, null);
        TreeNode t4 = new TreeNode(4);
        TreeNode t6 = new TreeNode(6);
        TreeNode t3 = new TreeNode(3, t2, t4);
        TreeNode t5 = new TreeNode(5, t3, t6);

        Assert.assertEquals(3, k.kthSmallest(t5, 3));
    }

    @Test
    public void test2(){

        TreeNode t2 = new TreeNode(2);
        TreeNode t1 = new TreeNode(1, null, t2);
        TreeNode t4 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, t1, t4);

        Assert.assertEquals(1, k.kthSmallest(t3, 1));
    }
}
