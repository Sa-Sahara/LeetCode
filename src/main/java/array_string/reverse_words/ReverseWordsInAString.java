package array_string.reverse_words;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        int start = -1;
        int end = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                start = i;
                if (end == -1)
                    end = i;
                if (start == 0) {
                    builder.append(s.substring(start, end + 1)).append(" ");
                    break;
                }
            } else {
                if (start >= 0) {
                    builder.append(s.substring(start, end + 1)).append(" ");
                    start = end = -1;
                }
            }
        }
        return builder.substring(0, builder.length() - 1);
    }
}
