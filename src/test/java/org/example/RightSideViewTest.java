package org.example;

import BFS_tree.RightSideView;
import org.junit.Assert;
import org.junit.Test;
import bin_tree_general.TreeNode;

import java.util.Arrays;
import java.util.List;

public class RightSideViewTest {
    RightSideView r = new RightSideView();

    @Test
    public void test() {
        TreeNode t6 = new TreeNode(6);
        TreeNode t3 = new TreeNode(3, t6, null);

        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5, t4, null);
        TreeNode t2 = new TreeNode(2, null, t5);

        TreeNode t1 = new TreeNode(1, t2, t3);

        List<Integer> fact = r.rightSideView(t1);
        System.out.println(fact);

        Assert.assertArrayEquals(new Integer[]{1, 3, 6, 4}, fact.toArray());
    }

    @Test
    public void test2() {
        TreeNode t5 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2, null, t5);

        TreeNode t4 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3, null, t4);

        TreeNode t1 = new TreeNode(1, t2, t3);

        List<Integer> fact = r.rightSideView(t1);
        System.out.println(fact);

        Assert.assertArrayEquals(new Integer[]{1, 3, 4}, fact.toArray());
    }
}
