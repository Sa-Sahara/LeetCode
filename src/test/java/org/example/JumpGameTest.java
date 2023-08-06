package org.example;

import array_string.jump_game.JumpGame;
import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {
    JumpGame j = new JumpGame();

    @Test
    public void test1() {
        Assert.assertTrue(j.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    public void test2() {
        Assert.assertFalse(j.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    public void test3() {
        Assert.assertTrue(j.canJump(new int[]{3}));
    }

    @Test
    public void test4() {
        Assert.assertFalse(j.canJump(new int[]{0, 1}));
    }
}
