package EASY;

import java.util.*;

public class RemoveUnbalancedParan {
	
	public static String removeUnbalancedParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        Set<Integer> toRemove = new HashSet<>();

        // First pass: Identify unbalanced '(' and ')'
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i); // Store index of '('
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); // Valid '(' found, so pop it
                } else {
                    toRemove.add(i); // Unbalanced ')'
                }
            }
        }

        // Remaining indices in the stack are unbalanced '('
        while (!stack.isEmpty()) {
            toRemove.add(stack.pop());
        }

        // Second pass: Build the valid string
        for (int i = 0; i < s.length(); i++) {
            if (!toRemove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.println(removeUnbalancedParentheses("((abc)((de))")); // Output: ((abc)(de))
        System.out.println(removeUnbalancedParentheses("(((ab)"));       // Output: (ab)
        System.out.println(removeUnbalancedParentheses("a)b(c)d)"));     // Output: "ab(c)d"
        System.out.println(removeUnbalancedParentheses(")("));           // Output: ""
		

	}

}
