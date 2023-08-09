package org.example;

import array_string.jump_game_II.JumpGameII;
import org.junit.Assert;
import org.junit.Test;

public class JumpGameIITest {
    JumpGameII j = new JumpGameII();

    @Test
    public void test1(){
//        Input: nums = [2,3,0,1,4]
//        Output: 2
        Assert.assertEquals(2, j.jump(new int[]{2,3,1,1,4}));
    }
}
