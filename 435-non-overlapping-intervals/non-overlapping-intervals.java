import java.util.*;

class Solution {

    class Pair implements Comparable<Pair> {

        int start;
        int finish;

        Pair(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        public int compareTo(Pair other) {
            return Integer.compare(this.finish, other.finish);
        }
    }

    public int eraseOverlapIntervals(int[][] intervals) {

        int n = intervals.length;

        if (n == 0) return 0;

        Pair[] matrix = new Pair[n];

        for (int i = 0; i < n; i++) {
            matrix[i] = new Pair(intervals[i][0], intervals[i][1]);
        }

        Arrays.sort(matrix);

        int count = 1;
        int finishTime = matrix[0].finish;

        for (int i = 1; i < n; i++) {

            if (matrix[i].start >= finishTime) {
                count++;
                finishTime = matrix[i].finish;
            }
        }

        return n - count;
    }
}