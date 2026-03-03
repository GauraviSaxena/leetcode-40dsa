class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int n = s.length();
        int count = 0;

        while (j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));                
                count = Math.max(j - i + 1, count);
                j++;
            } else {                                  
                set.remove(s.charAt(i));             
                i++;
            }
        }
        return count;
    }
}