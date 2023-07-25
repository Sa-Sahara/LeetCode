package org.example;

import org.junit.Assert;
import org.junit.Test;
import parentheses.ValidParentheses;

public class ValidParenthesesTest {
    ValidParentheses v = new ValidParentheses();

    @Test
    public void testCase1(){
//        Input: s = "()"
//        Output: true
        Assert.assertTrue(v.isValid("()"));
    }

    @Test
    public void testCase2(){
//        Input: s = "()[]{}"
//        Output: true
        Assert.assertTrue(v.isValid("()[]{}"));
    }

    @Test
    public void testCase3(){
//        Input: s = "(]"
//        Output: false
        Assert.assertFalse(v.isValid("(]"));
    }

    @Test
    public void testCase4(){
//        Input: s = "{[(){[]}]([])}"
//        Output: true
        Assert.assertTrue(v.isValid("{[(){[]}]([])}"));
    }

    @Test
    public void testCase5(){
//        Input: s = "{[(){[}]([])}"
//        Output: false
        Assert.assertFalse(v.isValid("{[(){[}]([])}"));
    }

    @Test
    public void testCase6(){
//        Input: s = "{["
//        Output: false
        Assert.assertFalse(v.isValid("{["));
    }

    @Test
    public void testCase7(){
//        Input: s = "){"
//        Output: false
        Assert.assertFalse(v.isValid("){"));
    }
}
