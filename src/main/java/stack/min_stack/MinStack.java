package stack.min_stack;

import java.util.LinkedList;

public class MinStack {
    LinkedList<Node> stack;

    public MinStack() {
        stack = new LinkedList<>();
    }

    public void push(int val) {
        int newMin;

        if (stack.size() == 0) {
            newMin = val;
        } else {
            newMin = Math.min(val, stack.peek().min);
        }

        stack.addLast(new Node(val, newMin));
    }

    public void pop() {
        stack.pollLast();
    }

    public int top() {
        return stack.peekLast().val;
    }

    public int getMin() {
        return stack.peekLast().min;
    }

    private static class Node{
        int val;
        int min;

        public Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
}