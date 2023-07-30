package array_string.length_of_last_word;

import javax.xml.stream.events.Characters;

public class LengthLastWordOptimal {
    public int lengthOfLastWord(String s) {
        if (s.isBlank()) return 0;
        int j = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' ') {
                j++;
            } else if (j > 0) {
                return j;
            }
        }
        return j;
    }
}
