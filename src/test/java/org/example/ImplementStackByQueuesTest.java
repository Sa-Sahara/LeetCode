package org.example;

import org.junit.Assert;
import org.junit.Test;
import stack.stack_by_queues.ImplementStackByQueues;

public class ImplementStackByQueuesTest {
    ImplementStackByQueues i = new ImplementStackByQueues();

    @Test
    public void test(){
        i.push(1);
        System.out.println(i.pop());
        Assert.assertTrue(i.empty());
    }
}
