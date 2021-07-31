package org.sergey.solutions;

import java.util.Arrays;
/*
205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.
 */

// TODO: Solution205
public class Solution205 {

    public boolean isIsomorphic(String s, String t) {
        int[] arrDictS = new int[128];
        Arrays.fill(arrDictS, -1);
        int[] arrDictT = new int[128];
        Arrays.fill(arrDictT, -1);

        for (int i = 0; i < s.length(); i++) {
            int c1 = s.charAt(i);
            int c2 = t.charAt(i);

            if (arrDictS[c1] == -1) {
                arrDictS[c1] = c2;
                if (arrDictT[c2] != -1) return false;
                arrDictT[c2] = c1;
            } else {
                if (arrDictS[c1] != c2) return false;
            }
        }

        return true;
    }
}
