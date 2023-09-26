package binary_search_tree.kth_smallest;

import bin_tree_general.TreeNode;

import java.util.LinkedList;

public class KthSmallestElement {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> l = new LinkedList<>();
        while (root != null) {
            l.push(root);
            root = root.left;
        }

        int counter = 0;
        while (!l.isEmpty()) {
            TreeNode tmp = l.pop();
            ++counter;
            if (counter == k) return tmp.val;

            TreeNode right = tmp.right;
            while (right != null) {
                l.push(right);
                right = right.left;
            }
        }
        return -1;
    }
}