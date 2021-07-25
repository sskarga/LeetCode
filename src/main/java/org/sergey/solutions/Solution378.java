package org.sergey.solutions;

import java.util.Arrays;

/*
378. Kth Smallest Element in a Sorted Matrix
Given an n x n matrix where each of the rows and columns are sorted in ascending order, return the kth smallest element in the matrix.
Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 */
public class Solution378 {
    public int kthSmallest(int[][] matrix, int k) {
        int arr[] = new int[matrix.length*matrix.length];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                arr[index] = matrix[i][j];
                index++;
            }
        }

        Arrays.sort(arr);

        return arr[k-1];
    }
}
