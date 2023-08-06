package liked_list.add_two_numbers;

import liked_list.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode((l1.val + l2.val) % 10);
        ListNode result = sum;
        int leftover = (l1.val + l2.val) / 10;
        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null || l2 != null) {
            int digit1 = l1 == null ? 0 : l1.val;
            int digit2 = l2 == null ? 0 : l2.val;
            leftover += digit1 + digit2;
            sum.next = new ListNode(leftover % 10);
            leftover /= 10;
            sum = sum.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        if (leftover != 0){
            sum.next = new ListNode(leftover);
        }
        return result;
    }
}
