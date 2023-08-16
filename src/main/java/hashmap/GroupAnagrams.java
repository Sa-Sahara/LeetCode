package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<MyKey, Integer> map = new HashMap<>();
        List<StringBuilder> list = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        Integer counter = 0;

        for (String s : strs) {
            if (s.isEmpty()){
                if (result.size() == 0){
                    result.add(new ArrayList<String>());
                }
                result.get(0).add("");
            } else {
                MyKey tmp = new MyKey(s);

                if (map.putIfAbsent(tmp, counter) == null) {
                    list.add(new StringBuilder(s));
                    counter++;
                } else {
                    list.get(map.get(tmp)).append(".").append(s);
                }
            }
        }

        for (StringBuilder b :
                list) {
            result.add(List.of(b.toString().split("\\.")));
        }

        return result;
    }

    public static class MyKey {
        private char[] chars;
        private String str;

        public char[] getChars() {
            return chars;
        }

        public MyKey(String str) {
            chars = str.toCharArray();
            Arrays.sort(chars);
            this.str = str;
        }

        @Override
        public int hashCode() {
            int hash = 0;
            for (char c :
                    chars) {
                hash += c * 31;
            }
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (!(obj instanceof MyKey)) return false;
            char[] other = ((MyKey) obj).getChars();

            if (chars.length != (other.length)) return false;

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != other[i]) return false;
            }
            return true;
        }
    }
}