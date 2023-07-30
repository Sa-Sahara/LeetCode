package org.example;

import array_string.prefix.LongestCommonPrefix;
import array_string.prefix.LongestCommonPrefixOptimal;
import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {
    LongestCommonPrefix l = new LongestCommonPrefix();
    LongestCommonPrefixOptimal o = new LongestCommonPrefixOptimal();

    @Test
    public void test1() {
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
        Assert.assertEquals("fl", o.longestCommonPrefix(
                new String[]{"flower", "flow", "flight"}));
    }

    @Test
    public void test2() {
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
        Assert.assertEquals("", o.longestCommonPrefix(
                new String[]{"dog", "racecar", "car"}));
    }

    @Test
    public void test3() {
//        Input: strs = ["",""]
//        Output: ""
        Assert.assertEquals("", o.longestCommonPrefix(
                new String[]{"", ""}));
    }

    @Test
    public void test4() {
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
        Assert.assertEquals("dog", o.longestCommonPrefix(
                new String[]{"dog", "dog", "dog"}));
    }

    @Test
    public void test5() {
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
        Assert.assertEquals("a", o.longestCommonPrefix(
                new String[]{"asddf","afrg"}));
    }
}
