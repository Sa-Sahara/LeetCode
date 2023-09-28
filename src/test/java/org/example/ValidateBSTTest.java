package org.example;

import bin_tree_general.TreeNode;
import binary_search_tree.validate_bst.ValidateBST;
import org.junit.Assert;
import org.junit.Test;

public class ValidateBSTTest {
    ValidateBST v = new ValidateBST();

    @Test
    public void test() {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(2, left, right);

        Assert.assertEquals(false, v.isValidBST(root));
    }
}
