package org.example;

import array_string.reverse_words.ReverseWordsInAString;
import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInAStringTest {

    ReverseWordsInAString r = new ReverseWordsInAString();

    @Test
    public void test1(){
        Assert.assertEquals("world hello", r.reverseWords("  hello world  "));
    }

    @Test
    public void test2(){
        Assert.assertEquals("example good a", r.reverseWords("a good   example"));
    }
}
