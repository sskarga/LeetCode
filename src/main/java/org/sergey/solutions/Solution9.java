package org.sergey.solutions;

/*
9 Palindrome Number

Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

Constraints:
    -231 <= x <= 231 - 1
    Follow up: Could you solve it without converting the integer to a string?
*/

public class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0 || x < 10) return true;

        int num = x;
        int reverseNum = 0;
        try {
            while (x > 0) {
                reverseNum = Math.addExact(Math.multiplyExact(reverseNum, 10), x % 10);
                x = x / 10;
            }
        } catch (ArithmeticException e) {
            return false;
        }

        return num == reverseNum;
    }
}
