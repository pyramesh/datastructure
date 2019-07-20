import java.util.regex.*;

public class Solution {

    // Complete the maximumPerimeterTriangle function below.
    static int[] maximumPerimeterTriangle(int[] sticks) {
        
    // Triangle inequality theorem states that
        // for any non-degenerate triangle, the sum
        // of the lengths of any two sides must be
        // greater than the length of the remaining
        // side.

        // Sort sticks in ascending order.
        Arrays.sort(sticks);
        // Reverse sticks in decending order.
        for (int k = 0; k < sticks.length / 2; k++) {
            int j = sticks.length - 1 - k;
            int tmp = sticks[k];
            sticks[k] = sticks[j];
            sticks[j] = tmp;
        }
        // Go through the sticks in
        // descending order.
        for (int i = 0; i < sticks.length - 2; ++i) {
            if (sticks[i] < sticks[i + 1] + sticks[i + 2]) {
                // This is a non-degenerate triangle.
                // Because we ordered the sticks
                // in descending order this
                // triangle must have the maximum
                // perimeter.
                return new int[] { sticks[i + 2], sticks[i + 1], sticks[i] };
            }
        }
        return new int[] { -1 };
    }

    



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] sticks = new int[n];

        String[] sticksItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int sticksItem = Integer.parseInt(sticksItems[i]);
            sticks[i] = sticksItem;
        }

        int[] result = maximumPerimeterTriangle(sticks);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
