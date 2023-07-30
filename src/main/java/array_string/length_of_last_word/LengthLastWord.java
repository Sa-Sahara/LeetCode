package array_string.length_of_last_word;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        if (s.isBlank()) return 0;

        String sCopy = s.trim();

        if(sCopy.lastIndexOf(" ") == -1) {
            return sCopy.length();
        } else {
            return sCopy.length() - sCopy.lastIndexOf(" ") - 1;
        }
    }
}
