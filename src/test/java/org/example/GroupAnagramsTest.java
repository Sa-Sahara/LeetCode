package org.example;

import hashmap.group_anagrams.GroupAnagrams;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GroupAnagramsTest {

    GroupAnagrams g = new GroupAnagrams();

    @Test
    public void test1() {
//        [["bat"],["nat","tan"],["ate","eat","tea"]]
        List<List<String>> result = new ArrayList<>();
        result.add(List.of("ate", "eat", "tea"));
        result.add(List.of("tan", "nat"));
        result.add(List.of("bat"));

        Assert.assertEquals(result, g.groupAnagrams(new String[]{"ate", "eat", "tea", "tan", "nat", "bat"}));
    }

    @Test
    public void test2() {
        GroupAnagrams.MyKey ate = new GroupAnagrams.MyKey("ate");
        GroupAnagrams.MyKey eat = new GroupAnagrams.MyKey("eat");
        System.out.println(ate.hashCode());

        System.out.println(ate.equals(eat));
    }
}