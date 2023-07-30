package hashmap.isomorphic_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> map = new HashMap<>();
        Set<Map.Entry<Character, Character>> entrySet = map.entrySet();

        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            Character value = t.charAt(i);
            if (!map.containsKey(key)) {
                if (!map.containsValue(value)) {
                    map.put(key, value);
                } else {
                    return false;
                }
            } else {
                if (map.get(key) != value)
                    return false;
            }
        }
        return true;
    }
}
