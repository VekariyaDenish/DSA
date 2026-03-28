package String;

import java.util.Stack;

//20. Valid Parentheses
public class ValidParatheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));

    }
    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }

        return stack.isEmpty();



//        char[] open  = {'(', '{', '['};
//        char[] close = {')', '}', ']'};
//
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//
//            // check if it's an opener
//            for (int k = 0; k < 3; k++) {
//                if (open[k] == s.charAt(i)) {
//                    stack.push(s.charAt(i)); // remember it
//                    break;
//                }
//            }
//
//            // check if it's a closer
//            for (int k = 0; k < 3; k++) {
//                if (close[k] == s.charAt(i)) {
//                    if (stack.isEmpty() || stack.pop() != open[k]) {
//                        return false; // order wrong or mismatch
//                    }
//                    break;
//                }
//            }
//        }
//
//        return stack.isEmpty();
    }
}
