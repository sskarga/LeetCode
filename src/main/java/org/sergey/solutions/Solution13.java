package org.sergey.solutions;

/* #13
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Constraints:
    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/

import java.util.HashMap;
import java.util.Map;

public class Solution13 {

    public int romanToInt(String s) {

        int curNum = 0, nextNum = 0, result = 0;

        for(int i = s.length()-1; i>=0; i--){

            switch(s.charAt(i)){
                case 'I' : nextNum = 1;
                    break;
                case 'V' : nextNum = 5;
                    break;
                case 'X' : nextNum = 10;
                    break;
                case 'L' : nextNum = 50;
                    break;
                case 'C' : nextNum = 100;
                    break;
                case 'D' : nextNum = 500;
                    break;
                case 'M' : nextNum = 1000;
                    break;
                default :
                    break;
            }

            if(curNum > nextNum)
                result -= nextNum;
            else
                result += nextNum;

            curNum = nextNum;
        }

        return result;

    }

    public int romanToInt3(String s) {
        Map<String, Integer> dictionary= new HashMap<>(){{
            put("I", 1);
            put("IV", 4);
            put("V", 5);
            put("IX", 9);
            put("X", 10);
            put("XL", 40);
            put("L", 50);
            put("XC", 90);
            put("C", 100);
            put("CD", 400);
            put("D", 500);
            put("CM", 900);
            put("M", 1000);
        }};

        int result = 0;
        String key = "";

        for(int i = 0; i < s.length(); i++) {
            if ((i + 1) < s.length()) {
                key = s.substring(i, i+2);
                if (dictionary.containsKey(key)) {
                    result += dictionary.get(key);
                    i++;
                    continue;
                };
            }

            key = s.substring(i, i+1);
            if (dictionary.containsKey(key)) {
                result += dictionary.get(key);
            };
        }

        return result;
    }

    public int romanToInt2(String s) {
        int result = 0;
        int dig = 0;
        char firstChar = ' ';
        char secondChar = ' ';
        int count = s.length();
        for(int i = 0; i < count; i++) {
            result = result + dig;

            firstChar = s.charAt(i);

            if ((i + 1) >= count) {
                secondChar = ' ';
            } else {
                secondChar = s.charAt(i + 1);
            };

            if (firstChar == 'I') {
                if (secondChar == 'V') {
                    dig = 4;
                    i++;
                    continue;
                };
                if (secondChar == 'X') {
                    dig = 9;
                    i++;
                    continue;
                };
                dig = 1;
                continue;
            };

            if (firstChar == 'X') {
                if (secondChar == 'L') {
                    dig = 40;
                    i++;
                    continue;
                };
                if (secondChar == 'C') {
                    dig = 90;
                    i++;
                    continue;
                };
                dig = 10;
                continue;
            };

            if (firstChar == 'C') {
                if (secondChar == 'D') {
                    dig = 400;
                    i++;
                    continue;
                };
                if (secondChar == 'M') {
                    dig = 900;
                    i++;
                    continue;
                };
                dig = 100;
                continue;
            };

            if (firstChar == 'V') {
                dig = 5;
                continue;
            };

            if (firstChar == 'L') {
                dig = 50;
                continue;
            };

            if (firstChar == 'D') {
                dig = 500;
                continue;
            };

            if (firstChar == 'M') {
                dig = 1000;
                continue;
            };
        }

        return result + dig;
    }
}
