package org.example;

import org.junit.Assert;
import org.junit.Test;
import path.SimplifyPath;

public class SimplifyPathTest {
    SimplifyPath s = new SimplifyPath();

    @Test
    public void testCase1(){
//        Input: path = "/home/"
//        Output: "/home"
//        Explanation:
//        Note that there is no trailing slash after the last directory name.
        Assert.assertEquals("/home", s.simplifyPath("/home/"));
    }

    @Test
    public void testCase2(){
//        Input: path = "/../"
//        Output: "/"
        Assert.assertEquals("/", s.simplifyPath("/../"));
    }

    @Test
    public void testCase3(){
//        Input: path = "/home//foo/"
//        Output: "/home/foo"
        Assert.assertEquals("/home/foo", s.simplifyPath("/home//foo/"));
    }

    @Test
    public void testCase4(){
//        Input: path = "/a/./b/../../c/"
//        Output: "/c"
        Assert.assertEquals("/c", s.simplifyPath("/a/./b/../../c/"));
    }

    @Test
    public void testCase5(){
//        Input: path = "/a//b////c/d//././/.."
//        Output: "/c"
        Assert.assertEquals("/a/b/c", s.simplifyPath("/a//b////c/d//././/.."));
    }
}
