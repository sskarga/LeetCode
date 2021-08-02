package org.sergey.solutions;

/*
42. Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 */
public class Solution42 {
    public int trap(int[] height) {
        int ans = 0;

        if (height.length < 2) return ans;

        int leftCursor = 0;
        int leftMaxHeight = height[leftCursor];

        int rightCursor = height.length-1;
        int rightMaxHeight = height[rightCursor];

        while(leftCursor <= rightCursor) {
            if (leftMaxHeight <= rightMaxHeight) {
                if (height[leftCursor] > leftMaxHeight) {
                    leftMaxHeight = height[leftCursor];
                } else {
                    ans = ans + leftMaxHeight - height[leftCursor];
                }
                leftCursor++;
            } else {
                if (height[rightCursor] > rightMaxHeight) {
                    rightMaxHeight = height[rightCursor];
                } else {
                    ans = ans + rightMaxHeight - height[rightCursor];
                }
                rightCursor--;
            }
        }
        return ans;
    }
}
