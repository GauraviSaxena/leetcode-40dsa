class Solution {

    public int findTargetSumWays(int[] nums, int target) {

        int totalSum = 0;
        for (int x : nums) totalSum += x;

        if (Math.abs(target) > totalSum) return 0;
        if ((totalSum + target) % 2 != 0) return 0;

        int sum1 = (totalSum + target) / 2;

        int[] dp = new int[sum1 + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int s = sum1; s >= num; s--) {
                dp[s] += dp[s - num];
            }
        }

        return dp[sum1];
    }
}