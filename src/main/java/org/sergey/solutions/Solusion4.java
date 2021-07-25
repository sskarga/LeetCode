package org.sergey.solutions;

/*
4. Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Constraints:
    nums1.length == m
    nums2.length == n
    0 <= m <= 1000
    0 <= n <= 1000
    1 <= m + n <= 2000
    -106 <= nums1[i], nums2[i] <= 106
* */

public class Solusion4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 ) return median(nums2);
        if (nums2 == null || nums2.length == 0 ) return median(nums1);

        return median(mergeArr(nums1, nums2));
    }

    int[] mergeArr(int[] a, int[] b) {
        int indexA = 0;
        int indexB = 0;
        int[] resArr = new int[a.length+b.length];
        for (int i = 0; i < resArr.length; i++) {
            if ( indexA == a.length || (indexB < b.length && a[indexA] > b[indexB])) {
                resArr[i] = b[indexB];
                indexB++;
            } else {
                resArr[i] = a[indexA];
                indexA++;
            }
        }
        return resArr;
    }

    double median(int[] arr) {
        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        } else {
            return 0.5*(arr[arr.length/2 - 1]+arr[arr.length/2]);
        }
    }
}
