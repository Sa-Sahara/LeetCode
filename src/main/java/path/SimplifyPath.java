package path;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean flag = false;

        for (int i = path.length() - 1; i >= 0; i--) {
            while (!flag) {
                if (path.charAt(i) != '/' && path.charAt(i) != '.') {
                    flag = true;
                } else {
                    --i;
                    if (i == -1) break;
                }
            }
            if (i == -1) return "/";

            if (path.charAt(i) == '.') {
                break;
            }

            if (path.charAt(i) == '/') {
                if (i == 0) {
                    stack.push('/');
                } else if (path.charAt(i - 1) != '/') {
                    stack.push('/');
                }
            } else {
                stack.push(path.charAt(i));
            }
        }

        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        if (builder.isEmpty()) {
            builder.append('/');
        }

        return builder.toString();
    }
}
