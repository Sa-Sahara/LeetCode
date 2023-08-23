package org.example;

import hashmap.contains_duplicate.ContainsDuplicate;
import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void test1() {
        Assert.assertEquals(true, containsDuplicate.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    @Test
    public void test2() {
        Assert.assertEquals(true, containsDuplicate.containsNearbyDuplicate(new int[]{2, 2}, 3));
    }
}
