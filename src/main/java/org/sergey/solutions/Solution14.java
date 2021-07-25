package org.sergey.solutions;

/*
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Constraints:
    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lower-case English letters.
 */

public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if ((strs == null) || (strs.length == 0)) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (prefix.length() > strs[i].length()) {
                prefix = prefix.substring(0, strs[i].length());
            }

            if (strs[i].indexOf(prefix) == 0) continue;

            while (true) {
                if (prefix.length() == 0) return "";
                prefix = prefix.substring(0, prefix.length() - 1);
                if (strs[i].indexOf(prefix) == 0) break;
            }
        }
        return prefix;
    }
}
