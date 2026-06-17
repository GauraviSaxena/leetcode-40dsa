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
            return Integer.compare(this.start, other.start);
        }
    }

    public int[][] merge(int[][] intervals) {

        int n = intervals.length;

        Pair[] matrix = new Pair[n];

        for (int i = 0; i < n; i++) {
            matrix[i] = new Pair(intervals[i][0], intervals[i][1]);
        }

        Arrays.sort(matrix);

        ArrayList<Pair> ans = new ArrayList<>();

        ans.add(matrix[0]);

        for (int i = 1; i < n; i++) {

            Pair last = ans.get(ans.size() - 1);

            if (matrix[i].start <= last.finish) {

                last.finish = Math.max(last.finish, matrix[i].finish);

            } else {

                ans.add(matrix[i]);
            }
        }

        int[][] res = new int[ans.size()][2];

        for (int i = 0; i < ans.size(); i++) {
            res[i][0] = ans.get(i).start;
            res[i][1] = ans.get(i).finish;
        }

        return res;
    }
}