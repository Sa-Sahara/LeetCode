package BFS_tree;

import bin_tree_general.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ZigZag {
    List<List<Integer>> l = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return l;

        LinkedList<TreeNode> q = new LinkedList<>();
        q.addFirst(root);
        int level = 0;

        while (!q.isEmpty()) {
            int s = q.size();
            List<Integer> tmp = new ArrayList<>();


            TreeNode node;

            if (level % 2 == 0) {
                for (int i = 0; i < s; i++) {
                    node = q.removeFirst();
                    tmp.add(node.val);
                    if (node.left != null) q.addLast(node.left);
                    if (node.right != null) q.addLast(node.right);
                }
            } else {
                for (int i = 0; i < s; i++) {
                    node = q.removeLast();
                    tmp.add(node.val);
                    if (node.right != null) q.addFirst(node.right);
                    if (node.left != null) q.addFirst(node.left);
                }
            }
            ++level;
            l.add(tmp);
        }
        for (List<Integer> list :
                l) {
            for (int i :
                    list) {
                System.out.println(i + " ");
            }
        }
        return l;
    }
}
