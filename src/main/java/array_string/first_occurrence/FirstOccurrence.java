package array_string.first_occurrence;

public class FirstOccurrence {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int tmpI = i;
                int j = 0;
                while (tmpI < haystack.length()) {
                    if (haystack.charAt(tmpI) != needle.charAt(j)) {
                        break;
                    } else {
                        ++j;
                        ++tmpI;
                        if (j == needle.length()) {
                            return tmpI - needle.length();
                        }
                    }
                }
            }
        }
        return -1;
    }
}
