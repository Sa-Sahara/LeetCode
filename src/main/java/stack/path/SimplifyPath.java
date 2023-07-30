package stack.path;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] strs = path.trim().split("/");
        Stack<String> stack = new Stack<>();

        for (String str : strs) {
            if (str.equals(".") || str.isEmpty()) {
                continue;
            } else if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }

        return "/" + String.join("/", stack);
    }
}
