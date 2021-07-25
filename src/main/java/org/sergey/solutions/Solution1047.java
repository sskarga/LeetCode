package org.sergey.solutions;

/*
Remove All Adjacent Duplicates In String
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
We repeatedly make duplicate removals on s until we no longer can.
Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
 */

import java.util.Stack;

public class Solution1047 {
    public String removeDuplicates2(String s) {
        Stack<Character> st = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (!st.empty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuffer ans = new StringBuffer();
        while(!st.isEmpty()) ans.insert(0, st.pop());
        return ans.toString();
    }

    public String removeDuplicates(String s) {
        char[] ans = s.toCharArray();
        int index = 0;
        for (int i = 1; i < ans.length; i++) {
            if (index == -1 || ans[index] != ans[i]) {
                index++;
                ans[index] = ans[i];
            } else {
                index = index == -1 ? -1 : index - 1;
            }
        }

        return String.copyValueOf(ans, 0 ,index+1);
    }
}
