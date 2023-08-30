package liked_list.reverse_II;

import liked_list.ListNode;

public class ReverseLLII {
    //    public ListNode reverseBetween(ListNode head, int left, int right) {
//        if (left == right) return head;
//
//        ListNode preTail = new ListNode(-1000);
//        ListNode result = head;
//
//        for (int i = 0; i < right - 1; i++){
//            if (i < left - 2) {
//                head = head.next;
//                continue;
//            }
//            ListNode tmp = head.next;
//            head.next = tmp.next;
//            tmp.next = preTail;
//            preTail = tmp;
//        }
//
//        ListNode tail = head.next;
//        head.next = preTail;
//        while (preTail.next.val != -1000){
//            preTail = preTail.next;
//        }
//        preTail.next = tail;
//
//        return result;
//    }
//}
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;

        ListNode falseHead = new ListNode(-1000);
        ListNode falseTail = new ListNode(-2000);

        falseHead.next = head;
        ListNode result = falseHead;

        for (int i = 0; i < right; i++) {
            if (i < left - 1) {
                falseHead = falseHead.next;
                continue;
            }

            ListNode tmp = falseHead.next;
            falseHead.next = tmp.next;
            tmp.next = falseTail;
            falseTail = tmp;
        }

        if (falseHead.next != null) {
            ListNode tail = falseHead.next;
            falseHead.next = falseTail;
            while (falseTail.next.val != -2000) {
                falseTail = falseTail.next;
            }
            falseTail.next = tail;
        } else {
            falseHead.next = falseTail;
            while (falseTail.next.val != -2000) {
                falseTail = falseTail.next;
            }
            falseTail.next = null;
        }

        if (result.val == -1000) {
            result = result.next;
        }
        return result;
    }
}
