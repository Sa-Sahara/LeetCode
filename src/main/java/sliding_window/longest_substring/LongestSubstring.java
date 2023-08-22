package sliding_window.longest_substring;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        int start = 0, longest = 1, end = 1;

        while (end < s.length() && start < s.length()){
            if (!s.substring(start, end).contains("" + s.charAt(end))){
                longest = Math.max(longest, end - start + 1);
            } else {
                start = (s.substring(start, end)).indexOf(s.charAt(end)) + 1 + start;
            }
            end++;
        }
        return longest;
    }
}
