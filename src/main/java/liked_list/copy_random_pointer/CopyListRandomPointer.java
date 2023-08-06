package liked_list.copy_random_pointer;

import liked_list.Node;

public class CopyListRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) return head;

        Node iterator = head;
        while (iterator != null){
            Node copy = new Node(iterator.val);
            copy.next = iterator.next;
            iterator.next = copy;
            iterator = copy.next;
        }

        iterator = head;
        while (iterator != null){
            if (iterator.random != null) {
                iterator.next.random = iterator.random.next;
            }
            iterator = iterator.next.next;
        }

        iterator = head;
        Node result = head.next;
        Node copy = head.next;
        Node nextInitial;
        while (iterator.next != null){
            iterator.next = copy.next;
            iterator = iterator.next;
            if (iterator == null) break;
            copy.next = copy.next.next;
            copy = copy.next;
        }

        return result;
    }
}