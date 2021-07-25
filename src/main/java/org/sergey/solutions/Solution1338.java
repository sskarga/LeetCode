package org.sergey.solutions;

import java.util.Arrays;
/*
1338. Reduce Array Size to The Half

You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers in the array.
Return the minimum size of the set so that at least half of the integers of the array are removed.
 */
public class Solution1338 {

    /*
       Runtime: 24 ms
       Memory Usage: 49 MB
    */
    public int minSetSize(int[] arr) {
        if (arr == null) return 0;
        int minSet = 1;

        final int maxLen = arr.length/2;
        if (maxLen == 1) return minSet;

        // Frequency
        Arrays.sort(arr);

        int[] frequency = new int[arr.length];
        int frequencyIndex = 0;

        int el = arr[0];
        int countEl = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == el) {
                countEl++;
                if (countEl >= maxLen) return minSet;
            } else {
                frequency[frequencyIndex] = countEl;
                frequencyIndex++;
                el = arr[i];
                countEl = 1;
            }
        }
        frequency[frequencyIndex] = countEl;

        // Sum
        Arrays.sort(frequency);
        int sumFrequency = frequency[frequency.length - 1];

        for (int i = frequency.length - 2; i >= 0 ; i--) {
            if (sumFrequency >= maxLen) {
                return minSet;
            } else {
                if (frequency[i] == 0) break;
                sumFrequency += frequency[i];
                minSet++;
            }
        }

        return minSet;
    }
}
