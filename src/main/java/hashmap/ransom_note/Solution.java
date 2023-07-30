package hashmap.ransom_note;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length())
            return false;

        StringBuilder builder = new StringBuilder(magazine);

        for (int i = 0; i < ransomNote.length(); i++) {
            if (i - ransomNote.length() > builder.length()) return false;

            int tmp = builder.indexOf(String.valueOf(ransomNote.charAt(i)));
            if (tmp < 0) return false;
            builder.deleteCharAt(tmp);
        }
        return true;
    }
}
