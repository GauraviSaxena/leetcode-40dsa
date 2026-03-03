import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];

            // word ko sort karo
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // agar key pehle se nahi hai
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // original word add karo
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}