class Solution {
    public int longestOnes(int[] nums, int k) {

        int curr_sum =0;
        int i=0;
        int j=0;
        int ans =0;
        int zero_count =0;

        for(int a=0;a<nums.length;a++)
        {
            if(nums[a]==0)
            {
                zero_count++;
            }
        }
        if(zero_count<k)return nums.length;
        while(j<nums.length)
        {
            curr_sum += nums[j];
            if(j-i+1 - curr_sum > k)
            {
                curr_sum -= nums[i];
                i++;
            }
            else if(j-i+1 - curr_sum == k)
            {
                ans=Math.max(ans,j-i+1);
            }
            j++;
        }
        return ans;
    }
}