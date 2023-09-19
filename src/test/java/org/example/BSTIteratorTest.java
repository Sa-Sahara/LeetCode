package org.example;

import bin_tree_general.TreeNode;
import bin_tree_general.bst_iterator.BSTIterator;
import org.junit.Assert;
import org.junit.Test;

public class BSTIteratorTest {

    @Test
    public void test(){
        TreeNode t3 = new TreeNode(3);
        TreeNode t9 = new TreeNode(9);
        TreeNode t20 = new TreeNode(20);
        TreeNode t15 = new TreeNode(15, t9, t20);
        TreeNode t7 = new TreeNode(7, t3, t15);

        BSTIterator bstIterator = new BSTIterator(t7);
        Assert.assertEquals(bstIterator.next(), 3);
        Assert.assertEquals(bstIterator.next(), 7);
        Assert.assertEquals(bstIterator.next(), 9);
        Assert.assertEquals(bstIterator.next(), 15);
        Assert.assertEquals(bstIterator.next(), 20);
    }
}
