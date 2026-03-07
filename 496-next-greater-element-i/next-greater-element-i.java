class Solution {
    public static void Solve(int[]nums,HashMap<Integer,Integer>map)
    {
        Stack<Integer>stack = new Stack<>();
        int n = nums.length;

        for(int i=n-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                map.put(nums[i],-1);
            }
            else if(!stack.isEmpty() && stack.peek()>nums[i])
            {
                map.put(nums[i],stack.peek());
            }
            else if(!stack.isEmpty() && stack.peek()<=nums[i])
            {
                while(!stack.isEmpty() && stack.peek()<=nums[i])
                {
                    stack.pop();
                }
                if(!stack.isEmpty())
                {
                    map.put(nums[i],stack.peek());
                }
                else
                {
                    map.put(nums[i],-1);
                }
            }
            stack.push(nums[i]);
        }
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int[]ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=-1;
        }
        Solve(nums2,map);
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}