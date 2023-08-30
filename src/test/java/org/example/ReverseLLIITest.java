package org.example;

import liked_list.ListNode;
import liked_list.reverse_II.ReverseLLII;
import org.junit.Test;

public class ReverseLLIITest {
    ReverseLLII r = new ReverseLLII();

    @Test
    public void test(){
        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        r.reverseBetween(l1, 2, 4);
    }

    @Test
    public void test2(){

        ListNode l2 = new ListNode(5);
        ListNode l1 = new ListNode(3, l2);

        r.reverseBetween(l1, 1, 2);
    }
}
