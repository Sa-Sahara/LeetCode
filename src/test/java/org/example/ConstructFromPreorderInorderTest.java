package org.example;

import bin_tree_general.TreeNode;
import bin_tree_general.construct_from_pre_inorder.ConstructFromPreorderInorder;
import org.junit.Test;

public class ConstructFromPreorderInorderTest {

    ConstructFromPreorderInorder c = new ConstructFromPreorderInorder();

    @Test
    public void test(){
        TreeNode t9 = new TreeNode(9);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        TreeNode t20 = new TreeNode(20, t15, t7);
        TreeNode t3 = new TreeNode(3, t9, t20);

        c.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
    }
}
