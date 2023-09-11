package org.example;

import org.junit.Assert;
import org.junit.Test;
import stack.calculator.Calc;

public class CalcTest {
    Calc calc = new Calc();

    @Test
    public void test1(){
        String s = "1 + 1";
        Assert.assertEquals(2, calc.calculate(s));
    }

    @Test
    public void test2(){
        String s = " 2-1 + 2 ";
        Assert.assertEquals(3, calc.calculate(s));
    }

    @Test
    public void test3(){
        String s = "(1+(4+5+2)-3)+(6+8)";
        Assert.assertEquals(23, calc.calculate(s));
    }
}
