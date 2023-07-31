package array_string.BFS_tree;

import bin_tree_general.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            long rowSum = 0;
            double qLength = q.size();
            for (int i = 0; i < qLength; i++) {
                TreeNode current = q.poll();
                rowSum += current.val;

                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }
            result.add(rowSum / qLength);
        }
        return result;
    }
}