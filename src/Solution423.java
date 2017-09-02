import java.util.Stack;

public class Solution423 {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        if (s.length() < 2 || s.length() % 2 != 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            } else if (chars[i] == ')') {
                if (stack.isEmpty()) {
                    result = false;
                    break;
                }
                char left = stack.pop();
                if (left != '(') {
                    result = false;
                    break;
                }
            } else if (chars[i] == '}') {
                if (stack.isEmpty()) {
                    result = false;
                    break;
                }
                char left = stack.pop();
                if (left != '{') {
                    result = false;
                    break;
                }
            } else if (chars[i] == ']') {
                if (stack.isEmpty()) {
                    result = false;
                    break;
                }
                char left = stack.pop();
                if (left != '[') {
                    result = false;
                    break;
                }
            } else {
                result = false;
                break;
            }
        }
        if (stack.size() > 0) {
            result = false;
        }
        return result;
    }
}