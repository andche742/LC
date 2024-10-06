class Solution {
    public boolean isValid(String s) {
        Stack<Character> hehe = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                hehe.add(i);
            }
            else if (hehe.isEmpty()) {
                return false;
            }
            else if (i == ')' && hehe.peek() == '(') {
                hehe.pop();
            }
            else if (i == '}' && hehe.peek() == '{') {
                hehe.pop();
            }
            else if (i == ']' && hehe.peek() == '[') {
                hehe.pop();
            }
            else {
                return false;
            }
        }
        if (hehe.isEmpty()) {
            return true;
        }
        return false;
    }
}