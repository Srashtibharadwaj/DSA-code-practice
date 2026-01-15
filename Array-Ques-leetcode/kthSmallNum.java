import java.util.PriorityQueue;

public class kthSmallNum {

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        if (n == 0) return -1;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[2], b[2])
        );

        for (int i = 0; i < n; i++) {
            minHeap.add(new int[]{i, 0, matrix[i][0]});
        }

        while (k > 1) {
            int[] curr = minHeap.poll();
            k--;

            int r = curr[0], c = curr[1];
            if (c + 1 < n) {
                minHeap.add(new int[]{r, c + 1, matrix[r][c + 1]});
            }
        }

        return minHeap.peek()[2];
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        System.out.println(kthSmallest(matrix, 8)); // Output: 13
    }
}
