package bin_tree_general.sum_root_to_leaf;

import bin_tree_general.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        List<Integer> sums = new ArrayList<>();

        sumBranch(root, 0, sums);

        return sumOfArray(sums);
    }

    public void sumBranch(TreeNode node, int sum, List<Integer> sums) {
        sum = sum * 10 + node.val;
        if (node.right == null && node.left == null) {
            sums.add(sum);
        }

        if (node.left != null) {
            sumBranch(node.left, sum, sums);
        }
        if (node.right != null) {
            sumBranch(node.right, sum, sums);
        }
    }

    public int sumOfArray(List<Integer> sums) {
        int result = 0;
        for (int i = 0; i < sums.size(); i++) {
            result += sums.get(i);
        }
        return result;
    }
}