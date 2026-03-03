import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // 1. sab numbers set me daal do
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int longest = 0;

        // 2. har number check karo
        for(int n : set){

            // agar pichla number nahi hai
            if(!set.contains(n - 1)){

                int count = 1;
                int curr = n;

                // aage ke numbers check karo
                while(set.contains(curr + 1)){
                    curr = curr + 1;
                    count = count + 1;
                }

                // max update karo
                if(count > longest){
                    longest = count;
                }
            }
        }

        return longest;
    }
}