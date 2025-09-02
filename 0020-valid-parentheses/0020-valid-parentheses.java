class Solution {
    public boolean isValid(String s) {
        char ch = s.charAt(0);
        if (ch == ')' || ch == '}' || ch == ']') return false;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char last = stack.pop();
                if (c == ')' && last != '(') return false;
                if (c == '}' && last != '{') return false;
                if (c == ']' && last != '[') return false;
            }
        }

        return stack.isEmpty();
    }
}
