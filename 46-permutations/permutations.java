class Solution {
    public static void Solve(int[] nums, List<List<Integer>> ans , boolean[] vis , ArrayList<Integer> temp)
    {
        if(temp.size() == nums.length)
        {
            ans.add(new ArrayList(temp)) ;
            return ;
        }

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(vis[i]) continue ;
            vis[i] = true ;
            temp.add(nums[i]) ;
            Solve(nums,ans,vis,temp) ;
            temp.remove(temp.size()-1) ;
            vis[i] = false ;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList() ;
        Solve(nums,ans, new boolean[nums.length] , new ArrayList<Integer>()) ;
        return ans ;
    }
}