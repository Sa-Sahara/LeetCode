package binary_search_tree.min_abs_diff;

import bin_tree_general.TreeNode;

public class MinimumAbsDiff {
    Integer res = Integer.MAX_VALUE, pre = null;

    public int getMinimumDifference(TreeNode root) {
        System.out.println("current root " + root);
        if (root.left != null) {
            System.out.println("root.left " + root.left + "!= null");
            getMinimumDifference(root.left);
        }
        System.out.println("pre " + pre + "!= null ???");
        if (pre != null) {
            res = Math.min(res, root.val - pre);
            System.out.println("res = Math.min(res, root.val - pre);");
            System.out.println("pre = " + pre);
            System.out.println("root.val " + root.val);
        }
        pre = root.val;
        System.out.println("pre = " + pre);
        if (root.right != null) {
            System.out.println("root.right " + root.right + "!= null");
            getMinimumDifference(root.right);
        }
        return res;
    }
}