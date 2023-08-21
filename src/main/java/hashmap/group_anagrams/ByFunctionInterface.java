package hashmap.group_anagrams;

import java.util.*;

public class ByFunctionInterface {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                map.computeIfAbsent(alphabetize(word), (key) -> new ArrayList<>()).add(word);
            }

            return new ArrayList<>(map.values());
        }

        public String alphabetize(String s) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    }
}
//        map.computeIfAbsent(key, k -> new ArrayList<>()).add(100);
//        вместо
//        map.putIfAbsent(key, new ArrayList<>());
//        map.get(key).add(100);