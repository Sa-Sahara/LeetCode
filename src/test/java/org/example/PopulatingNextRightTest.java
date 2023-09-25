package org.example;

import bin_tree_general.populating_nex_right.Node;
import bin_tree_general.populating_nex_right.PopulatingNextRight;
import org.junit.Assert;
import org.junit.Test;

public class PopulatingNextRightTest {
    PopulatingNextRight p = new PopulatingNextRight();

    @Test
    public void test(){
        Node n7 = new Node(7);
        Node n5 = new Node(5);
        Node n4 = new Node(4);
        Node n2 = new Node(2, n4, n5, null);
        Node n3 = new Node(3, null, n7, null);
        Node n1 = new Node(1, n2, n3, null);

        p.connect(n1);
        Assert.assertNull(n1.next);
        Assert.assertNull(n3.next);
        Assert.assertNull(n7.next);
    }
}
