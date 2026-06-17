class Solution {

    Boolean[] dp;

    public boolean canJump(int[] nums) {

        dp = new Boolean[nums.length];

        return solve(nums, 0);
    }

    public boolean solve(int[] nums, int index) {

        // Last index ya uske aage pahunch gaye
        if (index >= nums.length - 1) {
            return true;
        }

        // Already computed
        if (dp[index] != null) {
            return dp[index];
        }

        // Sab possible jumps try karo
        for (int jump = 1; jump <= nums[index]; jump++) {

            if (solve(nums, index + jump)) {
                return dp[index] = true;
            }
        }

        // Koi bhi jump successful nahi hua
        return dp[index] = false;
    }
}