package bin_tree_general.populating_nex_right;

import java.util.LinkedList;

public class PopulatingNextRight {
    private LinkedList<Node> q = new LinkedList<>();

    public Node connect(Node root) {
        if (root == null) return root;
        Node res = root;

        q.addFirst(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node tmp = q.peek();
                if (tmp.left != null) q.offer(tmp.left);
                if (tmp.right != null) q.offer(tmp.right);
                if (i != size - 1)
                    q.poll().next = q.peek();
                else q.poll();
            }
        }
        return res;
    }
}
