import java.util.*;

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    Boolean[][] dp;

    public boolean canCross(int[] stones) {

        int n = stones.length;

        dp = new Boolean[n][n + 1];

        for(int i = 0; i < n; i++) {
            map.put(stones[i], i);
        }

        return solve(stones, 0, 0);
    }

    private boolean solve(int[] stones, int index, int jump) {

        if(index == stones.length - 1) {
            return true;
        }

        if(dp[index][jump] != null) {
            return dp[index][jump];
        }

        for(int nextJump = jump - 1;
                nextJump <= jump + 1;
                nextJump++) {

            if(nextJump <= 0) continue;

            int nextStone = stones[index] + nextJump;

            if(map.containsKey(nextStone)) {

                int nextIndex = map.get(nextStone);

                if(solve(stones, nextIndex, nextJump)) {
                    return dp[index][jump] = true;
                }
            }
        }

        return dp[index][jump] = false;
    }
}