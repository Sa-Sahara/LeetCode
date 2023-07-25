package word_pattern;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) return false;
        if (s.length() == 1) return true;

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (Objects.equals(map.get(pattern.charAt(i)), words[i])) {
                continue;
            } else if (map.containsKey(pattern.charAt(i))) {
                return false;
            } else {
                if (!map.containsValue(words[i])) {
                    map.put(pattern.charAt(i), words[i]);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
