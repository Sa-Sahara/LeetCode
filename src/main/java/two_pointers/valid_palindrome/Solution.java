package two_pointers.valid_palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch)
            || Character.isDigit(ch)){
                builder.append(Character.toLowerCase(ch));
            }
        }
        s = builder.toString();
        return s.equals(builder.reverse().toString());
    }
}
