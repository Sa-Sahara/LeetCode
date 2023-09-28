package bin_tree_general.construct_from_pre_inorder;

import bin_tree_general.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructFromPreorderInorder {
    int pre = 0;
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length - 1);
    }
    private TreeNode helper(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootValue = preorder[pre++];
        TreeNode root = new TreeNode(rootValue);
        root.left = helper(preorder, left, map.get(rootValue) - 1);
        root.right = helper(preorder, map.get(rootValue) + 1, right);
        return root;
    }
}