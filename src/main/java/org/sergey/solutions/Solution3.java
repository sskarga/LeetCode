package org.sergey.solutions;

/*
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.

Constraints:
    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.
 */

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        int[] chars = new int[128];  // for ASCII

        int len = s.length();
        int windowPosLeft = 0;
        int windowPosRight = 0;
        int windowMaxSize = 1;

        while (windowPosRight < len) {
            char currentCh = s.charAt(windowPosRight);

            if (chars[currentCh] > windowPosLeft) {
                windowPosLeft = chars[currentCh];
            }
            windowPosRight++;
            chars[currentCh] = windowPosRight;
            windowMaxSize = Math.max(windowMaxSize, windowPosRight - windowPosLeft);

        }
        return windowMaxSize;
    }
}
