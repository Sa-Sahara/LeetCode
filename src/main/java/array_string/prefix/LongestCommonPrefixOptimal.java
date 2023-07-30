package array_string.prefix;

public class LongestCommonPrefixOptimal extends LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        int j = 0;

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() == 0) return "";
            int maxLength = Math.min(strs[0].length(), strs[i].length());
            if (i == 1) {
                while (j < maxLength && strs[0].charAt(j) == strs[i].charAt(j)) {
                    ++j;
                    if (j == maxLength) {
                        --j;
                        break;
                    }
                }
            } else {
                while (j >= 0 && strs[0].charAt(j) != strs[i].charAt(j))
                    --j;
            }
        }
        if (j < 0) return "";
        return strs[0].substring(0, j + 1);
    }
}
