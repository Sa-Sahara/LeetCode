package array_string.roman_numbers;

public class BetterSolution {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            char nextTmp = '0';

            if (i < s.length() - 1) {
                nextTmp = s.charAt(i + 1);
            }

            switch (tmp) {
                case 'I':
                    if (nextTmp == 'V') {
                        result += 4;
                        i++;
                    } else if (nextTmp == 'X') {
                        result += 9;
                        i++;
                    } else {
                        result += 1;
                    }
                    break;

                case 'X':
                    if (nextTmp == 'L') {
                        result += 40;
                        i++;
                    } else if (nextTmp == 'C') {
                        result += 90;
                        i++;
                    } else {
                        result += 10;
                    }
                    break;

                case 'C':
                    if (nextTmp == 'D') {
                        result += 400;
                        i++;
                    } else if (nextTmp == 'M') {
                        result += 900;
                        i++;
                    } else {
                        result += 100;
                    }
                    break;

                case 'V':
                    result += 5;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }
}
