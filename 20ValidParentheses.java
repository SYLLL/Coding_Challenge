public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        //two requirements: 
        //req1: everytime meets a symbol: ([{ simply push, others pull out
        //req2: check empty in the end
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == '[') {
                stack.push('[');
            } else if (s.charAt(i) == '{') {
                stack.push('{');
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                Character temp = stack.pop();
                if (s.charAt(i) == ')') {
                    if (temp != '(') {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (temp != '[') {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (temp != '{') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        } //end for
        return (stack.size() == 0);
    }
}