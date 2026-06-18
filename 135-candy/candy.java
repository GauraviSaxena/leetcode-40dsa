class Solution {
    public int candy(int[] ratings) {
        
        int n = ratings.length ;
        int[] Left = new int[n] ;
        Arrays.fill(Left,1) ;
        for(int i = 1 ; i < n ;i++)
        {
            if(ratings[i] > ratings[i-1])
            {
                Left[i] = Left[i-1]+1 ;
            }
        }

        int[] Right = new int[n] ;
        Arrays.fill(Right,1) ;
        for(int i = n-2 ; i >= 0 ; i--)
        {
            if(ratings[i] > ratings[i+1])
            {
                Right[i] = Right[i+1]+1 ;
            }
        }

        int ans = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            ans += Math.max(Left[i],Right[i]) ;
        }
        return ans ;
    }
}