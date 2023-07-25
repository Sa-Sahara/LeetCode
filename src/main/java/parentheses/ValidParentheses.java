package parentheses;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp == '(' || tmp == '{' || tmp == '[') {
                stack.push(tmp);
            } else {
                if(stack.isEmpty()) return false;

                if (tmp == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else return false;
                } else if (tmp == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else return false;
                } else {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else return false;
                }
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
