import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode56 {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int n = intervals.length;
        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];
        int i = 1;

        while (i < n) {
            if (current[1] >= intervals[i][0]) {
                int start = current[0];
                int end = Math.max(current[1], intervals[i][1]);
                current = new int[]{start, end};
                i++;
            } else {
                merged.add(current);
                current = intervals[i];
                i++;
            }
        }

        merged.add(current);

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        leetcode56 obj = new leetcode56();

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] result = obj.merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}