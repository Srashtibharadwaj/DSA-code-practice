import java.util.Arrays;

public class minimumMoveElement {

    // Method to find minimum moves
    public static int minMoves(int[] nums) {
        int minElement = Arrays.stream(nums).min().getAsInt();
        int moves = 0;

        for (int num : nums) {
            moves += (num - minElement);
        }
        return moves;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        int result = minMoves(nums);
        System.out.println("Minimum moves required: " + result);
    }
}
