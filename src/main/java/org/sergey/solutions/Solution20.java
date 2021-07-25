package org.sergey.solutions;

/* 20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */

import java.util.Stack;

public class Solution20 {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(')');
            } else

            if (ch == '{') {
                st.push('}');
            } else

            if (ch == '[') {
                st.push(']');
            } else

            if (st.empty() || st.pop() != ch) {
                return false;
            };
        }

        return st.empty();
    }
}
