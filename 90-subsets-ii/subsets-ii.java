class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void solve(int i, int[] nums, List<Integer> curr, List<List<Integer>> ans) {
        
        ans.add(new ArrayList<>(curr)); // har step pe add

        for (int j = i; j < nums.length; j++) {
            
            
            if (j > i && nums[j] == nums[j - 1]) continue;

            curr.add(nums[j]);
            solve(j + 1, nums, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}