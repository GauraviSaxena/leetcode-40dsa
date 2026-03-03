class Solution {

    public static int FindMin(int low , int high , int[] nums)
    {
        while(low < high)
        {
            int mid = low + (high-low)/2 ;
            if(nums[mid] > nums[high])
            {
                low = mid + 1 ;
            }
            else
            {
                high = mid ;
            }
        }

        return low ;
    }

    public static int BinarySearch(int low , int high , int[] nums , int target)
    {
        while(low <= high)
        {
            int mid = low + (high-low)/2 ;

            if(nums[mid] == target)
            {
                return mid ;
            }
            else if(nums[mid] < target)
            {
                low = mid + 1 ;
            }
            else
            {
                high = mid-1 ;
            }
        }
        return -1 ;
    }
    public int search(int[] nums, int target) {
        
        int n = nums.length ;

        int index = FindMin(0,n-1,nums) ;
        int ans = BinarySearch(0,index-1,nums,target) ;

        if(ans != -1)
        {
            return ans ;
        }

        ans = BinarySearch(index,n-1, nums,target) ;
        return ans ;
    }
}