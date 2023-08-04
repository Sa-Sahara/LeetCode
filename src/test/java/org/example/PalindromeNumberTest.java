package org.example;

import math.PalindromeNumber;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
    PalindromeNumber p = new PalindromeNumber();

    @Test
    public void test1(){
        Assert.assertTrue(p.isPalindrome(121));
    }
}
