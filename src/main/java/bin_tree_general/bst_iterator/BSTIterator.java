package bin_tree_general.bst_iterator;

import bin_tree_general.TreeNode;

import java.util.Stack;

public class BSTIterator {
    private Stack<Integer> q;

    public BSTIterator(TreeNode root) {
        q = new Stack<>();
        initQ(root, q);
    }

    private void initQ(TreeNode root, Stack<Integer> stack) {
        if (root.right != null) {
            initQ(root.right, stack);
        }
        if (root != null) stack.push(root.val);
        if (root.left != null) {
            initQ(root.left, stack);
        }
    }

    public int next() {
        return q.pop();
    }

    public boolean hasNext() {
        if(q.isEmpty()) return false;
        return q.isEmpty() ? false : q.peek() == null ? false : true;
    }
}

