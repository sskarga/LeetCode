package org.sergey.solutions;
/*
5. Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.
 */

public class Solution5 {

    // char[] charArr = s.toCharArray();
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int iRL = 0; // index result left
        int iRR = 0;

        int iL = 0;
        int iR = 0;

        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            iL = i;
            iR = i;

            while (iR < charArr.length) {
                if (iL == 0) break;
                iL--;
                iR++;

                if (iR == charArr.length || charArr[iR] != charArr[iL]) {
                    iR--;

                    // is double char
                    if (iR == i && charArr[iR] == charArr[iL]) continue;

                    iL++;
                    break;
                }
            }

            // Max len palindrome
            if (iR-iL+1 > iRR-iRL) {
                iRR = iR+1;
                iRL = iL;
            }
        }

        return s.substring(iRL, iRR);
    }


    public String longestPalindrome2(String s) {
        if (s == null || s.length() < 1) return "";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            final String palindrome = findPalindrome2(s,i);

            if (palindrome.length() > result.length()) {
                result = palindrome;
            }
        }

        return result;
    }


    String findPalindrome2(String s, int index) {
        int indexLeft = index;
        int indexRight = index;

        while (indexRight < s.length()) {
            if (indexLeft == 0) break;
            indexLeft--;

            indexRight++;
            if ((indexRight == s.length()) || (s.charAt(indexRight) != s.charAt(indexLeft))) {
                indexRight--;

                // is double char
                if ((indexRight == index) && s.charAt(indexRight) == s.charAt(indexLeft)) continue;

                indexLeft++;
                break;
            }
        }

        String res = s.substring(indexLeft, indexRight+1);

        return res;
    }
}
