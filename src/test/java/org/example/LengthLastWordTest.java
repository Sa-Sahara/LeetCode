package org.example;

import length_of_last_word.LengthLastWord;
import org.junit.Assert;
import org.junit.Test;

public class LengthLastWordTest {
    @Test
    public void testCase1() {
//        Input: s = "Hello World"
//        Output: 5
//        Explanation: The last word is "World" with length 5.

        LengthLastWord l = new LengthLastWord();
        Assert.assertEquals(l.lengthOfLastWord("Hello World"), 5);
    }

    @Test
    public void testCase2() {
    //Input: s = "   fly me   to   the moon  "
    //Output: 4
    //Explanation: The last word is "moon" with length 4.

        LengthLastWord l = new LengthLastWord();
        Assert.assertEquals(l.lengthOfLastWord("   fly me   to   the moon  "), 4);
    }

    @Test
    public void testCase3() {
//        Input: s = "luffy is still joyboy"
//        Output: 6
//        Explanation: The last word is "joyboy" with length 6.

        LengthLastWord l = new LengthLastWord();
        Assert.assertEquals(l.lengthOfLastWord("luffy is still joyboy"), 6);
    }
}
