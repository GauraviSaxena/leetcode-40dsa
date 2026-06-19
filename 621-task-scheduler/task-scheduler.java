class Solution {

    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        // Count frequency
        for (char ch : tasks) {
            freq[ch - 'A']++;
        }

        // Maximum frequency
        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Count tasks having maximum frequency
        int countMax = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                countMax++;
            }
        }

        return Math.max(tasks.length,
                (maxFreq - 1) * (n + 1) + countMax);
    }
}