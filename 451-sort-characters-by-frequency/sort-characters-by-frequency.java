class Solution {
    class Pair
    {
        char ch ;
        int freq ;
        Pair(char ch , int freq)
        {
            this.ch = ch ;
            this.freq = freq ;
        }
    }
    public String frequencySort(String s) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq)) ;
        HashMap<Character,Integer> map = new HashMap<>() ;
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1) ;
        }

        for(char ch : map.keySet())
        {
            pq.add(new Pair(ch,map.get(ch))) ;
        }

        StringBuilder sb = new StringBuilder() ;

        while(!pq.isEmpty())
        {
            int count = pq.peek().freq ;
            char c = pq.poll().ch ;
            while(count > 0)
            {
                sb.append(c) ;
                count-- ;
            }
        }

        return sb.toString() ;
    }
}