package org.example;

import first_occurrence.FirstOccurrence;
import org.junit.Assert;
import org.junit.Test;

public class FirstOccurrenceTest {
    FirstOccurrence f = new FirstOccurrence();

    @Test
    public void Test1(){
//        Input: haystack = "sadbutsad", needle = "sad"
//        Output: 0

        Assert.assertEquals(0, f.strStr("sadbutsad", "sad"));
    }

    @Test
    public void Test2(){
//        Input: haystack = "leetcode", needle = "leeto"
//        Output: -1

        Assert.assertEquals(-1, f.strStr("leetcode", "leeto"));
    }

    @Test
    public void Test3(){
//        Input: haystack = "adbutsad", needle = "sad"
//        Output: 0

        Assert.assertEquals(5, f.strStr("adbutsad", "sad"));
    }

    @Test
    public void Test4(){
//        Input: haystack = "a", needle = "a"
//        Output: 0

        Assert.assertEquals(0, f.strStr("a", "a"));
    }

    @Test
    public void Test6(){
//        Input: haystack = "mississippi", needle = "issip"
//        Output: 0

        Assert.assertEquals(4, f.strStr("mississippi", "issip"));
    }

    @Test
    public void Test7(){
//        Input: haystack = "aabaaabaaac", needle = "aabaaac"
//        Output: 0

        Assert.assertEquals(4, f.strStr("aabaaabaaac", "aabaaac"));
    }
}
