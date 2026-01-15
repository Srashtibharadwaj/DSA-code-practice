import java.util.TreeMap;

public class findInterval {

    // Method to find right interval
    public static int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer, Integer> startPoints = new TreeMap<>();

        // Store start point with its index
        for (int i = 0; i < intervals.length; i++) {
            startPoints.put(intervals[i][0], i);
        }

        int[] ans = new int[intervals.length];

        // Find the right interval for each interval
        for (int i = 0; i < intervals.length; i++) {
            Integer nextClosestStartPoint =
                    startPoints.ceilingKey(intervals[i][1]);

            ans[i] = (nextClosestStartPoint == null)
                    ? -1
                    : startPoints.get(nextClosestStartPoint);
        }

        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}};

        int[] result = findRightInterval(intervals);

        for (int r : result) {
            System.out.print(r + " ");
        }
    }
}

