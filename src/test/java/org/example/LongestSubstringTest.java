package org.example;

import org.junit.Assert;
import org.junit.Test;
import sliding_window.longest_substring.LongestSubstring;

public class LongestSubstringTest {

    LongestSubstring l = new LongestSubstring();

    @Test
    public void test1(){
        Assert.assertEquals(6, l.lengthOfLongestSubstring("bbtablud"));
    }
}
