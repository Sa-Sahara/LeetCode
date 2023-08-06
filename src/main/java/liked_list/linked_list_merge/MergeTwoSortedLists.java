package liked_list.linked_list_merge;

import liked_list.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode tmp;

        if (list1 != null && list2 == null
                || list1 != null && list1.val <= list2.val) {
            head = tmp = copyNode(list1);
            list1 = list1.next;
        } else {
            head = tmp = copyNode(list2);
            if (list2 != null) {
                list2 = list2.next;
            }
        }

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 == null
                    || list1 != null && list1.val <= list2.val) {
                tmp.next = copyNode(list1);
                tmp = tmp.next;
                list1 = list1.next;
            } else {
                tmp.next = copyNode(list2);
                tmp = tmp.next;
                list2 = list2.next;
            }
        }
        return head;
    }

    public ListNode copyNode(ListNode listNode) {
        if (listNode == null) return null;
        return new ListNode(listNode.val, listNode.next);
    }
}
