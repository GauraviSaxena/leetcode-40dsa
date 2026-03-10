class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int elementsum=0;
        int digitsum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            elementsum+=nums[i];
            int num=nums[i];
            while(num>0){
                digitsum+=num%10;
                num=num/10;
            }
          ans=elementsum-digitsum;
        }
        return ans;
    }
}