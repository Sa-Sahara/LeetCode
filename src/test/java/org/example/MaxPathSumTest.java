package org.example;

import bin_tree_general.TreeNode;
import bin_tree_general.max_path_sum.MaxPathSum;
import org.junit.Test;

public class MaxPathSumTest {
    MaxPathSum m = new MaxPathSum();

    @Test
    public void test(){
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t1 = new TreeNode(1, t2, t3);
        m.maxPathSum(t1);
    }
}
