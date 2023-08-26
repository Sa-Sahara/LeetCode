package BFS_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import bin_tree_general.TreeNode;

public class RightSideView { //todo: find optimal solution
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> right = new ArrayList<>();
        if (root == null) return right;

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> level = new LinkedList<>();
        queue.offer(root);
        level.offer(1);
        right.add(root.val);
        int maxLevel = 1;

        while (!queue.isEmpty()) {
            TreeNode tmpNode = queue.poll();
            Integer tmpLevel = level.poll();

            if (tmpLevel > maxLevel){
                right.add(tmpNode.val);
                maxLevel = tmpLevel;
            }

            if (tmpNode.right != null) {
                queue.offer(tmpNode.right);
                level.offer(tmpLevel + 1);
            }

            if (tmpNode.left != null) {
                queue.offer(tmpNode.left);
                level.offer(tmpLevel + 1);
            }
        }

        return right;
    }
}