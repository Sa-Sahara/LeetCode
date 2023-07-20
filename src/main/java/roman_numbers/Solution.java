package roman_numbers;

import java.util.HashMap;

class Solution {

    public int romanToInt(String s) {
        int result = 0;
        HashMap<String, Integer> numbers = romanNumbers();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i));
            if (i < s.length() - 1) {
                builder.append(s.charAt(i + 1));
                if (numbers.containsKey(builder.toString())) {
                    result += numbers.get(builder.toString());
                    i++;
                    builder.setLength(0);
                    if (i == s.length() - 1 ) {
                        break;
                    }
                    continue;
                } else {
                    builder.setLength(1);
                }
            }
            result += numbers.get(builder.toString());
            builder.setLength(0);
        }
        return result;
    }

    public HashMap<String, Integer> romanNumbers() {
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);
        numbers.put("IV", 4);
        numbers.put("IX", 9);
        numbers.put("XL", 40);
        numbers.put("XC", 90);
        numbers.put("CD", 400);
        numbers.put("CM", 900);
        return numbers;
    }
}