import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
        Random random = new Random();
        int[] orig = new int[10];
        int[] data = new int[10];

        // Generate random array
        for (int i = 0; i < orig.length; i++) {
            orig[i] = random.nextInt(100);  // Random number between 0 and 99
            data[i] = orig[i];
        }

        // Print original arrays
        System.out.println("arrays equal before sort: " + Arrays.equals(orig, data));
        System.out.println("orig = " + Arrays.toString(orig));
        System.out.println("data = " + Arrays.toString(data));

        // Sort the data array
        Arrays.sort(data);

        // Print after sorting
        System.out.println("\narrays equal after sort: " + Arrays.equals(orig, data));
        System.out.println("orig = " + Arrays.toString(orig));
        System.out.println("data = " + Arrays.toString(data));
    }
}
