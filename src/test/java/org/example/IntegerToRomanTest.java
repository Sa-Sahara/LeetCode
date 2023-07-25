package org.example;

import integer_to_roman.IntegerToRoman;
import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {
    IntegerToRoman i = new IntegerToRoman();

    @Test
    public void testCase1(){
//        Input: num = 3
//        Output: "III"
//        Explanation: 3 is represented as 3 ones.
        Assert.assertEquals(i.intToRoman(3), "III");

    }

    @Test
    public void testCase2(){
//        Input: num = 58
//        Output: "LVIII"
//        Explanation: L = 50, V = 5, III = 3.
        Assert.assertEquals(i.intToRoman(58), "LVIII");

    }

    @Test
    public void testCase3(){
//        Input: num = 1994
//        Output: "MCMXCIV"
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
        Assert.assertEquals(i.intToRoman(1994), "MCMXCIV");

    }

    @Test
    public void testCase4(){
//        Input: num = 9
//        Output: "IX"
        Assert.assertEquals(i.intToRoman(1888), "MDCCCLXXXVIII");
    }
}
