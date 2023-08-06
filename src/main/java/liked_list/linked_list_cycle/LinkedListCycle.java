package liked_list.linked_list_cycle;

import liked_list.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }
}
