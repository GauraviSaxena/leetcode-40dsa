class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int leftSum = 0 ;
        int rightSum = 0 ;
        int maxSum = 0 ;
        int n = cardPoints.length ;
        for(int i = 0 ; i < k ; i++)
        {
            leftSum += cardPoints[i] ;
        }
        maxSum = Math.max(leftSum,maxSum) ;

        for(int i = 0 ; i < k ; i++)
        {
            rightSum += cardPoints[n-i-1] ;
            leftSum -= cardPoints[k-1-i] ;
            maxSum = Math.max(rightSum+leftSum,maxSum) ;
        }
        return maxSum ;
    }
}