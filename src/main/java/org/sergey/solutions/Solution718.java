package org.sergey.solutions;

/*
718. Maximum Length of Repeated Subarray
Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.
 */
public class Solution718 {
    public int findLength2(int[] nums1, int[] nums2) {
        int max = 0;
        int dp[][] = new int[nums1.length + 1][nums2.length + 1];
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }

    public int findLength3(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] dp = new int[n + 1];

        int result = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = n; j >= 1; j--) {
                dp[j] = nums1[i - 1] == nums2[j - 1] ? dp[j - 1] + 1 : 0;
                result = Math.max(result, dp[j]);
            }
        }
        return result;
    }

    public int findLength(int[] nums1, int[] nums2) {
        int max = 0;
        int dp[] = new int[nums2.length+1];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = nums2.length; j > 0; j--) {
                if (nums1[i] == nums2[j-1]) {
                    dp[j] = dp[j-1] + 1;
                    max = Math.max(max, dp[j]);
                } else {
                    dp[j] = 0;
                }
            }
        }
        return max;
    }
}
