package org.example;

public class MaxSubarraySum {
    public static int maxSubArraySum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int currentMax = nums[0];
        int globalMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArraySum(new int[]{1, -2, 3, 5, -1})); // 输出 8
        System.out.println(maxSubArraySum(new int[]{1, -2, 3, -8, 5, 1})); // 输出 6
        System.out.println(maxSubArraySum(new int[]{1, -2, 3, -2, 5, 1})); // 输出 7
    }
}
