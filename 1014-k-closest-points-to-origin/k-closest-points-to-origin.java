
class Solution {
    class Pair
    {
        int sum ;
        int x ;
        int y ;
        Pair(int sum , int x , int y)
        {
            this.sum = sum ;
            this.x = x ;
            this.y = y ;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(b.sum,a.sum)) ;
        for(int i = 0 ; i < points.length ; i++)
        {

                int square = points[i][0]*points[i][0] + points[i][1]*points[i][1] ;
                pq.add(new Pair(square,points[i][0],points[i][1])) ;
                if(pq.size() > k)
                {
                    pq.poll() ;
                }
            
        }
        int[][] ans = new int[k][2] ;
        int i = 0 ; 
        while(!pq.isEmpty())
        {
            Pair p = pq.poll() ;
            ans[i][0] = p.x ;
            ans[i][1] = p.y ;
            i++ ;
        }
        return ans ;
    }
}