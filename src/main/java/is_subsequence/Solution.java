package is_subsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        for (int i = 0, j = 0; i < s.length(); i++, j++) {
            int tmp = t.indexOf(s.charAt(i), j);
            if (tmp < 0)
                return false;
            j = tmp;
        }
        return true;
    }
}
