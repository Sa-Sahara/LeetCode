package BFS_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {
    Queue<TreeNode> q = new LinkedList<>();
    List<List<Integer>> l = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return l;

        q.offer(root);

        while (!q.isEmpty()) {
            int s = q.size();
            List<Integer> tmp = new ArrayList<>();

            for (int i = 0; i < s; i++) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.left);
                }
                tmp.add(node.val);
            }

            l.add(tmp);
        }
        return l;
    }
}