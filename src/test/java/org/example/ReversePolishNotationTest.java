package org.example;

import org.junit.Assert;
import org.junit.Test;
import stack.polish_notation.ReversePolishNotation;

public class ReversePolishNotationTest {
    ReversePolishNotation r = new ReversePolishNotation();

    @Test
    public void test1() {
        Assert.assertEquals(2, r.evalRPN(new String[]{"5", "1", "+", "3", "/"}));
    }

    @Test
    public void test2() {
        Assert.assertEquals(6, r.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    public void test3() {
        Assert.assertEquals(22, r.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
