package array_string.prefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        int j = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            while (j > 0) {
                if (!strs[i].startsWith(strs[0].substring(0, j))) --j;
                else break;
            }
            if (j <= 0) return "";
        }
        return strs[0].substring(0, j);
    }
}
