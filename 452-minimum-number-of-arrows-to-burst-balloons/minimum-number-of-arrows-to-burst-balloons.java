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

    public int findMinArrowShots(int[][] points) {

        int n = points.length;

        if(n == 0)
            return 0;

        Pair[] matrix = new Pair[n];

        for(int i = 0; i < n; i++) {
            matrix[i] = new Pair(points[i][0], points[i][1]);
        }

        Arrays.sort(matrix);

        int arrows = 1;
        int finishTime = matrix[0].finish;

        for(int i = 1; i < n; i++) {

            if(matrix[i].start > finishTime) {

                arrows++;
                finishTime = matrix[i].finish;
            }
        }

        return arrows;
    }
}