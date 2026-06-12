class Solution {
    public static int Solve(int i , int j , String str1 , String str2 , int[][] dp)
    {
        if(i == str1.length() || j == str2.length()) return 0 ;

        if(dp[i][j] != -1)
        {
            return dp[i][j] ;
        }

        int take = 0 ;
        if(str1.charAt(i) == str2.charAt(j))
        {
            take = 1 + Solve(i+1,j+1,str1,str2,dp) ;
        }
        
        int notTake = Math.max(Solve(i+1,j,str1,str2,dp),Solve(i,j+1,str1,str2,dp)) ;

        return dp[i][j] = Math.max(take,notTake) ;

        
    }
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] dp = new int[text1.length()+1][text2.length()+1] ;
        for(int i = 0 ; i < text1.length()+1 ; i++)
        {
            for(int j = 0 ; j < text2.length() ; j++)
            {
                dp[i][j] = -1 ;
            }
        }
        return Solve(0,0,text1,text2,dp) ;
    }
}