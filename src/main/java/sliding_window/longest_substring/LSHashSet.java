package sliding_window.longest_substring;

import java.util.HashSet;
import java.util.Set;

public class LSHashSet {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        Set<Character> set = new HashSet<>();
        int start = 0, longest = 1;

        for (int end = 0; end < s.length(); end++){
            if (!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                longest = Math.max(longest, end - start + 1);
            } else {
                while (s.charAt(start) != s.charAt(end)){
                    set.remove(s.charAt(start++));
                }
                set.remove(s.charAt(start++));
                set.add(s.charAt(end));
            }
        }
        return longest;
    }
}
