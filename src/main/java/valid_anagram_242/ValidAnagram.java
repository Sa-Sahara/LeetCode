package valid_anagram_242;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Integer num = map.get(s.charAt(i));
            if (num == null) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), ++num);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            Integer num = map.get(t.charAt(i));
            if (num == null) {
                return false;
            } else {
                map.put(t.charAt(i), --num);
            }
        }

        for (Integer i :
                map.values()) {
            if (i != 0) return false;
        }

        return true;

    }

    public boolean isAnagram2Variant(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;

        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public boolean isAnagram3Variant(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;

        int sArr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            sArr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            sArr[t.charAt(i) - 'a']--;
            if (sArr[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (sArr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
