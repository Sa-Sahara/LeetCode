package stack.calculator;

import java.util.LinkedList;

public class Calc {
    int index;

    public int calculate(String s) {
        index = 0;
        return calcRecursive(s);
    }

    private int calcRecursive(String s) {
        int result = 0, number = 0, sign = 1;

        while (index < s.length()) {
            char tmp = s.charAt(index++);

            switch (tmp) {
                case ' ' -> {
                }
                case '(' -> number = calcRecursive(s);
                case ')' -> {
                    return result + sign * number;
                }
                case '+', '-' -> {
                    result += sign * number;
                    number = 0;
                    sign = tmp == '+' ? 1 : -1;
                }
                default -> number = number * 10 + (tmp - '0');
            }
        }
        return result + sign * number;
    }
}