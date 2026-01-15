import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    // Returns a specific row of Pascal's Triangle
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);

        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long nextVal = prev * (rowIndex - k + 1) / k;
            res.add((int) nextVal);
            prev = nextVal;
        }
        return res;
    }

    // Main method for testing
    public static void main(String[] args) {
        int rowIndex = 4;
        List<Integer> result = getRow(rowIndex);

        System.out.println("Pascal's Triangle Row " + rowIndex + ":");
        System.out.println(result);
    }
}
