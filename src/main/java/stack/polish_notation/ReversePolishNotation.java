package stack.polish_notation;

import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result;

        for (String s : tokens) {
            switch (s) {
                case ("+") -> {
                    result = stack.pop() + stack.pop();
                    stack.push(result);
                }
                case ("-") -> {
                    result = - stack.pop() + stack.pop();
                    stack.push(result);
                }
                case ("*") -> {
                    result = stack.pop() * stack.pop();
                    stack.push(result);
                }
                case ("/") -> {
                    int tmp = stack.pop();
                    result = stack.pop() / tmp;
                    stack.push(result);
                }
                default -> stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}