package org.example;

import liked_list.ListNode;
import liked_list.add_two_numbers.AddTwoNumbers;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {
    AddTwoNumbers a = new AddTwoNumbers();

    @Test
    public void test1(){
//        Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.
        ListNode l1_2 = new ListNode(3);
        ListNode l1_1 = new ListNode(4, l1_2);
        ListNode l1_0 = new ListNode(2, l1_1);

        ListNode l2_2 = new ListNode(4);
        ListNode l2_1 = new ListNode(6, l2_2);
        ListNode l2_0 = new ListNode(5, l2_1);

        ListNode l3_2 = new ListNode(8);
        ListNode l3_1 = new ListNode(0, l3_2);
        ListNode l3_0 = new ListNode(7, l3_1);

        ListNode res = a.addTwoNumbers(l1_0, l2_0);
        while (res != null){
            Assert.assertEquals(res.val, l3_0.val);
            res = res.next;
            l3_0 = l3_0.next;
        }
    }

    @Test
    public void test2(){
//        Input: l1 = [5], l2 = [5]
//        Output: [1,0]
        ListNode l1_0 = new ListNode(5, null);

        ListNode l2_0 = new ListNode(5, null);

        ListNode l3_1 = new ListNode(1, null);
        ListNode l3_0 = new ListNode(0, l3_1);

        ListNode res = a.addTwoNumbers(l1_0, l2_0);
        while (res != null){
            Assert.assertEquals(res.val, l3_0.val);
            res = res.next;
            l3_0 = l3_0.next;
        }
    }
}
