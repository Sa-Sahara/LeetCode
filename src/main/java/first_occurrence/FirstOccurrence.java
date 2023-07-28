package first_occurrence;

public class FirstOccurrence {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        for (int i = 0, j = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                while (j < needle.length() && i < haystack.length()) {
                    if (haystack.charAt(i) != needle.charAt(j)) {
                        j = 0;
                    } else {
                        ++j;
                        ++i;
                        if (j == needle.length()) {
                            return i - needle.length();
                        }
                    }
                }
            }
        }
        return -1;
    }
}
