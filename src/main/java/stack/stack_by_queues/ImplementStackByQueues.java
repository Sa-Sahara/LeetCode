package stack.stack_by_queues;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackByQueues {
    private Queue<Integer> queue;
    private Queue<Integer> tail;

    public ImplementStackByQueues() {
        queue = new LinkedList<>();
        tail = new LinkedList<>();
    }

    public void push(int x) {
        if (!tail.isEmpty()) {
            queue.offer(tail.poll());
        }
        tail.offer(x);
    }

    public int pop() {
        int res = tail.poll();
        while (!queue.isEmpty()) {
            tail.offer(queue.poll());
        }
        while (tail.size() > 1) {
            queue.offer(tail.poll());
        }
        return res;
    }

    public int top() {
        return tail.peek();
    }

    public boolean empty() {
        return tail.size() == 0 && queue.size() == 0;
    }
}
